package lexer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Test {
	private static int idValue = 0;

	public static void main(String[] args) throws IOException {
//		Map<String, Integer> hashTokens = new HashMap<String, Integer>();
//
//		BufferedReader in = new BufferedReader(new InputStreamReader(
//				new FileInputStream("source.robo"), "UTF8"));
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
//				new FileOutputStream("tokens"), "UTF-8"));
//		JFlexLexer lexer = new JFlexLexer(in);
//
//		OldToken token = null;
//		
//
//		while ((token = lexer.yylex()) != null) {
//			out.write(token.toString());
//			if (token == OldToken.ID) {
//				if (hashTokens.get(lexer.leksema) == null)
//					hashTokens.put(lexer.leksema, idValue++);
//				out.write(String.format("(%d) l=%d c=%d\n",
//						hashTokens.get(lexer.leksema), lexer.line, lexer.column));
//			} else {
//				out.write(String.format(" l=%d c=%d\n", lexer.line,
//						lexer.column));
//			}
//		}
//
//		out.write("\nID TABLE\n");
//		for (Map.Entry<String, Integer> iter : hashTokens.entrySet())
//			out.write(String.format("%d %s\n", iter.getValue(), iter.getKey()));
//
//		out.close();
	}
}
