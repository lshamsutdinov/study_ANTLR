package study.antlr.first;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {
	
	public static void main(String[] args) throws RecognitionException {
		
		CharStream charStream = new ANTLRStringStream("test test123 345");
		MyLexer lexer = new MyLexer(charStream);
		
		TokenStream tokenStream  = new CommonTokenStream(lexer);
		MyParser parser = new MyParser(tokenStream);
		
		parser.rule();
		
		System.out.println("done!");
		
	}

}
