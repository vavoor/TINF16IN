
java -jar ../../lib/antlr-4.7.1-complete.jar -no-listener -visitor Selector.g4
javac -d ../dst -cp .:../../lib/antlr-4.7.1-complete.jar *.java
