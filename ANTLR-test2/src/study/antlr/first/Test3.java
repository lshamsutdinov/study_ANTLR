package study.antlr.first;


import java.util.Enumeration;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

public class Test3 {

	public static void main(String[] args) throws Exception {

		// создаем объект лексера. В качестве входа используем стандартный
		// ввод или поток символов.
		// ANTLRInputStream input = new ANTLRInputStream(System.in);
		CharStream input = new ANTLRStringStream("Jhon 400 Smith 500 Aero 100");
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
			System.exit(0);
		}
		
		// Отображаем содержимое таблицы.
	      Enumeration keys = parser.results.keys();
	      while(keys.hasMoreElements())
	      {
	         String key = (String)keys.nextElement();
	         System.out.println(">" + key + " " + parser.results.get(key));
	      }
		
		System.out.println("done3!");
		
	}

}
