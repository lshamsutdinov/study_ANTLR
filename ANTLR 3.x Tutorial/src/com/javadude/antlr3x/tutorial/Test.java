package com.javadude.antlr3x.tutorial;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {
	
	public static void main(String[] args) throws RecognitionException {
		
		CharStream charStream = new ANTLRStringStream("once upon a time");
		// CharStream charStream = new ANTLRStringStream("once upon ?? a time");
		XLLexer lexer = new XLLexer(charStream);
		
		TokenStream tokenStream  = new CommonTokenStream(lexer);
		XLParser parser = new XLParser(tokenStream);
		
		parser.rule();
		
		System.out.println("done!");
		
	}

}
