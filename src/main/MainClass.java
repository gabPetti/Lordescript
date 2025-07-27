package main;

import parser.LordescriptLexer;

import java.nio.charset.StandardCharsets;

import parser.LordescriptParser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import codegen.Visitor;

public class MainClass {
    public static void main(String[] args) {
        try {
            LordescriptLexer lexer;
            LordescriptParser parser;

            // Create lexer from input file, mapping every fragment with a token
            lexer = new LordescriptLexer(CharStreams.fromFileName("resources/input.lord", StandardCharsets.UTF_8));

            // Create token stream from the lexer
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            tokenStream.fill();
            for (Token token : tokenStream.getTokens()) {
            System.out.println("Token: " + token.getText() + ", Type: " +
            token.getType());
            }

            // Create parser from the token stream
            parser = new LordescriptParser(tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                        int line, int charPositionInLine, String msg, RecognitionException e) {
                    throw new RuntimeException("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
                }
            });

            ParseTree tree = parser.prog(); // Entry rule
            System.out.println(tree == null ? "Parse tree is null" : "Parse tree generated successfully");
            Visitor visitor = new Visitor();
            String output = visitor.visit(tree);

            System.out.println(output);
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}