#! /bin/bash

(cd src; java -jar ../../antlr-4.7.1-complete.jar -visitor -no-listener Pipifax.g4)
javac -d dst -cp ../antlr-4.7.1-complete.jar\; src/*.java src/pfx/*.java
# java -cp .\;../antlr-4.7.1-complete.jar org.antlr.v4.gui.TestRig Expr prog -gui input.tst
