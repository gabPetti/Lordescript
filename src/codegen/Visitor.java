package codegen;

import parser.LordescriptBaseVisitor;
import parser.LordescriptParser;

public class Visitor extends LordescriptBaseVisitor<String> {
    @Override
    public String visitProg(LordescriptParser.ProgContext ctx) {
        String block = visit(ctx.block());
        return "public class Main { public static void main(String[] args) {" + (block) + "}}";
    }
}
