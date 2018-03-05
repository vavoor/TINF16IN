
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import java.io.IOException;
import org.antlr.v4.runtime.RecognitionException;

class Main {
	public static void main(String[] args) {
		try {
			CharStream stream = CharStreams.fromFileName(args[0]);
			Lexer lexer = new SelectorLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SelectorParser parser = new SelectorParser(tokens);
			SelectorParser.Mail_selectorContext ast = parser.mail_selector();
			
			SelectorBaseVisitor v = new SelectorBaseVisitor<Void>();
			v.visit(ast);
		}
		catch (IOException e) {
			System.err.println("Cannot open input file: "+e);
		}
		catch (RecognitionException e) {
			System.err.println("Syntax error: "+e);
		}
		
	}
}
