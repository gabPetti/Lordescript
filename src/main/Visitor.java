package main;

import parser.LordescriptBaseVisitor;
import parser.LordescriptParser;

public class Visitor extends LordescriptBaseVisitor<String> {
    @Override
    public String visitProg(LordescriptParser.ProgContext ctx) {
        try {
            StringBuilder sb = new StringBuilder();

            sb.append("public class Main {\n");
            sb.append("\tpublic static void main(String[] args) {\n");
            if (ctx.block() != null) {
                sb.append(ctx.block().accept(this));
            }
            sb.append("\t}\n");
            sb.append("}");

            return sb.toString();
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            return "Error in visiting the program.";
        }
    }
}
