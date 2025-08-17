package main;

import parser.LordescriptBaseVisitor;
import parser.LordescriptParser;
import java.util.HashMap;
import java.util.Map;

public class Visitor extends LordescriptBaseVisitor<String> {
    @Override
    public String visitProg(LordescriptParser.ProgContext ctx) {
        try {
            StringBuilder sb = new StringBuilder();

            sb.append("import java.util.Scanner;\n\n");
            sb.append("public class Main {\n");
            sb.append("\tpublic static void main(String[] args) {\n");
            sb.append("\t\tScanner scan = new Scanner(System.in);\n");

            if (ctx.block() != null) {
                for (LordescriptParser.CmdContext cmd : ctx.block().cmd()) {
                    sb.append(visit(cmd));
                }
            }
            sb.append("\t\tscan.close();\n");
            sb.append("\t}\n");
            sb.append("}");

            return sb.toString();
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            return "error";
        }
    }

    private final Map<String, String> symbolTable = new HashMap<>();

    private String translateType(String type) {
        switch (type) {
            case "inteiro":
                return "int";
            case "fracionário":
                return "double";
            default:
                throw new RuntimeException(
                        "Este plebeu tipo \"" + type + "\" não tem lugar em nosso reino de variáveis nobres");
        }
    }

    @Override
    public String visitCmdDeclare(LordescriptParser.CmdDeclareContext ctx) {
        String varName = ctx.ID().getText();

        if (symbolTable.containsKey(varName)) {
            // return "\t\t" + varName + " = " + visit(ctx.expr()) + ";\n";
            throw new RuntimeException("Atesto perante a corte que a ilustre variável \"" +
                    varName + "\" já foi consagrado nos anais deste reino");
        }

        String javaType = translateType(ctx.type().getText());

        symbolTable.put(varName, javaType);
        return "\t\t" + javaType + " " + varName + " = " + visit(ctx.expr()) + ";\n";
    }

    @Override
    public String visitCmdAssign(LordescriptParser.CmdAssignContext ctx) {
        String varName = ctx.ID().getText();

        if (!symbolTable.containsKey(varName)) {
            // return "\t\t" + varName + " = " + visit(ctx.expr()) + ";\n";
            throw new RuntimeException("Atesto perante a corte que a variável \"" +
                    varName
                    + "\" se comportou de forma profana e não se declarou à realeza antes de ser agraciada com um valor");
        }

        return "\t\t" + varName + " = " + visit(ctx.expr()) + ";\n";
    }

    @Override
    public String visitCmdWrite(LordescriptParser.CmdWriteContext ctx) {
        String varName = ctx.ID().getText();
        String javaType = translateType(ctx.type().getText());

        symbolTable.put(varName, javaType);

        String javaTypeCapitalized = javaType.substring(0, 1).toUpperCase() + javaType.substring(1);
        return "\t\t" + javaType + " " + varName + " = scan.next" + javaTypeCapitalized + "();\n";
    }

    @Override
    public String visitCmdRead(LordescriptParser.CmdReadContext ctx) {
        String value = ctx.ID() != null ? ctx.ID().getText() : ctx.STRING().getText();
        return "\t\tSystem.out.println(" + value + ");\n";
    }

    private String translateComparison(String op) {
        switch (op) {
            case "revelar-se como símile a":
                return "==";
            case "revelar-se como menor que":
                return "<";
            case "revelar-se como maior que":
                return ">";
            case "revelar-se como díspar a":
                return "!=";
            case "revelar-se como menor ou igual que":
                return "<=";
            case "revelar-se como maior ou igual que":
                return ">=";
            default:
                return op;
        }
    }

    @Override
    public String visitCmdLogic(LordescriptParser.CmdLogicContext ctx) {
        String left = ctx.ID().size() > 0 ? ctx.ID(0).getText() : visit(ctx.expr(0));

        String right;
        if (ctx.ID().size() > 1) {
            right = ctx.ID(1).getText();
        } else if (ctx.expr().size() > 1) {
            right = visit(ctx.expr(1));
        } else if (ctx.expr().size() == 1 && ctx.ID().size() == 1) {
            right = visit(ctx.expr(0));
        } else {
            throw new RuntimeException(
                    "Por ordem real: a mão direita da comparação não se fez presente perante o tribunal sintático");
        }

        return left + " " + translateComparison(ctx.COMPARE().getText()) + " " + right;
    }

    @Override
    public String visitIf_stmt(LordescriptParser.If_stmtContext ctx) {
        StringBuilder sb = new StringBuilder();

        // Condição if principal
        sb.append("\t\tif (").append(visit(ctx.cmdLogic())).append(") {\n")
                .append(visit(ctx.block()))
                .append("\t\t}");

        // Condições elif (Porém se)
        if (ctx.elif_stmt() != null) {
            for (LordescriptParser.Elif_stmtContext elif : ctx.elif_stmt()) {
                sb.append(" else if (").append(visit(elif.cmdLogic())).append(") {\n")
                        .append(visit(elif.block()))
                        .append("\t\t}");
            }
        }

        // Condição else (Caso contrário)
        if (ctx.else_stmt() != null && !ctx.else_stmt().isEmpty()) {
            sb.append(" else {\n")
                    .append(visit(ctx.else_stmt(0).block()))
                    .append("\t\t}");
        }

        sb.append("\n");
        return sb.toString();
    }

    @Override
    public String visitWhile_stmt(LordescriptParser.While_stmtContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\twhile (").append(visit(ctx.cmdLogic())).append(") {\n");

        for (LordescriptParser.CmdContext cmd : ctx.block().cmd()) {
            sb.append(visit(cmd));
        }

        sb.append("\t\t}\n");
        return sb.toString();
    }

    @Override
    public String visitDo_while_stmt(LordescriptParser.Do_while_stmtContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\tdo {\n");

        for (LordescriptParser.CmdContext cmd : ctx.block().cmd()) {
            sb.append(visit(cmd));
        }

        sb.append("\t\t} while (").append(visit(ctx.cmdLogic())).append(");\n");
        return sb.toString();
    }

    @Override
    public String visitExpr(LordescriptParser.ExprContext ctx) {
        if (ctx.expr() != null) {
            String left = visit(ctx.expr_mult());
            String right = visit(ctx.expr());
            String op = ctx.PLUS() != null ? " + " : " - ";
            return left + op + right;
        }
        return visit(ctx.expr_mult());
    }

    @Override
    public String visitExpr_mult(LordescriptParser.Expr_multContext ctx) {
        if (ctx.expr_mult() != null) {
            String left = visit(ctx.expr_sum());
            String right = visit(ctx.expr_mult());
            String op = ctx.MULT() != null ? " * " : " / ";
            return left + op + right;
        }
        return visit(ctx.expr_sum());
    }

    @Override
    public String visitExpr_sum(LordescriptParser.Expr_sumContext ctx) {
        if (ctx.FLOAT() != null) {
            return ctx.FLOAT().getText();
        } else if (ctx.INTEGER() != null) {
            return ctx.INTEGER().getText();
        } else if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.ABRE_P() != null) {
            return "(" + visit(ctx.expr()) + ")";
        }
        return visit(ctx.expr());
    }
}