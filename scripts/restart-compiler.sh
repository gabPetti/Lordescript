#!/bin/bash
java -cp .:antlr-4.13.2-complete.jar org.antlr.v4.Tool Lordescript.g4 -visitor -package parser -o ./src/parser
javac -cp ".:antlr-4.13.2-complete.jar" -d out $(find src -name "*.java")

