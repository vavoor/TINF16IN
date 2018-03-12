echo Building

java -jar ..\..\antlr-4.7.1-complete.jar -no-listener -visitor Selector.g4
javac -d ..\dst -cp .;..\dst;..\..\antlr-4.7.1-complete.jar *.java
