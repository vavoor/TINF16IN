import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import java.io.IOException;
import org.antlr.v4.runtime.RecognitionException;

import pfx.Node;

public class Pfc {
    public static void main(String[] args) {
		try {
			CharStream stream = CharStreams.fromFileName(args[0]);
			Lexer lexer = new PipifaxLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			PipifaxParser parser = new PipifaxParser(tokens);
			PipifaxParser.ProgramContext tree = parser.program();
			
			ASTBuilder v = new ASTBuilder();
            Node ast = tree.accept(v);
            
            System.out.println("Done!");
		}
		catch (IOException e) {
			System.err.println("Cannot open input file: "+e);
		}
		catch (RecognitionException e) {
			System.err.println("Syntax error: "+e);
		}
	}
}
