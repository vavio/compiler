package analyzer;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringBufferInputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args) throws IOException {
		LinkedList<Identifier> tokenslist = new LinkedList<Identifier>();
		
		BufferedReader in = new BufferedReader(
		           new InputStreamReader(
		                      new FileInputStream("fichero.txt"), "UTF8"));
//		String text = in.readLine();
		String text = "ако ако";
		System.out.println(text);
		InputStream stream = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
//		Reader r = new InputStreamReader(new FileInputStream("fichero.txt"), "UTF8");
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		
		Lexer lexer = new Lexer(in);
		String resultado = "";
		int contIDs = 0;
		while (true) {
			Token token = lexer.yylex();
			if (token == null) {
				for (int i = 0; i < tokenslist.size(); i++) {
					System.out.println(tokenslist.get(i).nombre + "="
							+ tokenslist.get(i).ID);
				}
				// jTextField2.setText(resultado);
				return;
			}
			switch (token) {
			case ERROR:
				resultado = resultado + "Error, simbolo no reconocido ";
				break;
			case ID: {
				contIDs++;
				Identifier tokenitem = new Identifier();
				tokenitem.nombre = lexer.lexeme;
				tokenitem.ID = contIDs;
				tokenslist.add(tokenitem);
				resultado = resultado + "<ID" + contIDs + "> ";
				break;
			}
			case INT:
				resultado = resultado + "< " + lexer.lexeme + "> ";
				System.out.println(String.format("< %s >", lexer.lexeme));
				break;
			default:
				resultado = resultado + "<" + lexer.lexeme + "> ";
			}

		}
	}
}
