#! /bin/bash

java -jar ../lib/antlr-4.7.1-complete.jar Expr.g4
javac -cp ../lib/antlr-4.7.1-complete.jar *.java
java -cp .:../lib/antlr-4.7.1-complete.jar org.antlr.v4.gui.TestRig Expr prog -gui

