package main;

import parser.LordescriptLexer;
// import parser.LordescriptParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class MainClass {
    public static void main(String[] args) {
        try {
            LordescriptLexer lexer;
            // LordescriptParser parser;

            // Create lexer from input file, mapping every fragment with a token
            lexer = new LordescriptLexer(CharStreams.fromFileName("resources/input.lord"));

            // Create token stream from the lexer
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            tokenStream.fill();
            for (Token token : tokenStream.getTokens()) {
                System.out.println("Token: " + token.getText() + ", Type: " + token.getType());
            }

            // Create parser from the token stream
            // parser = new LordescriptParser(tokenStream);

            // parser.prog();

            System.out.println("Compilation successful. No errors found.");
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}