package study.antlr.first;

import java.io.DataInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test2 {

	public static void main(String[] args) throws Exception {

		// создаем объект лексера. В качестве входа используем стандартный
		// ввод или поток символов.
		// ANTLRInputStream input = new ANTLRInputStream(System.in);
		CharStream input = new ANTLRStringStream("test test123 345");
		MyLexer lexer = new MyLexer(input);

		// создаем объект парсера
		TokenStream tokenStream = new CommonTokenStream(lexer);
		MyParser parser = new MyParser(tokenStream);

		try {
			// вызываем парсинг по правилу rule
			parser.rule();
		} catch (Exception e) {
			// обрабатываем ошибки
			System.out.println("Error: " + e);
		}
		
		System.out.println("done2!");
	}

}
