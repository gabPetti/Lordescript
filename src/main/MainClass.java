package main;

import parser.LordescriptLexer;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import parser.LordescriptParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.Trees;
import javax.swing.*;

public class MainClass {
    /**
     * Outputs the generated code to a file.Output.java
     *
     * @param output the generated code as a string
     */
    private static void outputInFile(String output) {
        try {
            File outputFile = new File("resources/Main.java");
            outputFile.createNewFile();
            outputFile.setWritable(true);

            FileWriter myWriter = new FileWriter("resources/Main.java");
            myWriter.write(output);
            myWriter.close();
            System.out.println("Successfully Transpiled code.");
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    private static String formatTree(ParseTree tree, LordescriptParser parser) {
        String rawTree = tree.toStringTree(parser);
        StringBuilder formatted = new StringBuilder();
        int indent = 0;

        for (char c : rawTree.toCharArray()) {
            if (c == '(') {
                formatted.append("\n").append("  ".repeat(indent)).append("(");
                indent++;
            } else if (c == ')') {
                indent--;
                formatted.append(")");
            } else {
                formatted.append(c);
            }
        }
        return formatted.toString();
    }

    /**
     * Main method to run the Lordescript parser and visitor.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        try {
            LordescriptLexer lexer;
            LordescriptParser parser;

            // Create lexer from input file, mapping every fragment with a token
            lexer = new LordescriptLexer(CharStreams.fromFileName("resources/input.lord", StandardCharsets.UTF_8));

            // Create token stream from the lexer
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            // Create parser from the token stream
            parser = new LordescriptParser(tokenStream);
            ParseTree tree = parser.prog(); // Entry rule

            Trees.inspect(tree, parser); // open the GUI tree viewer

            // System.out.println(formatTree(tree, parser)); // outputs tree in console

            // Transpile the parse tree to Java code
            String output = new Visitor().visit(tree);
            outputInFile(output);
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
