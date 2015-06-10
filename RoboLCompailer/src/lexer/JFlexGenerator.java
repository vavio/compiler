package lexer;

import java.io.File;

public class JFlexGenerator {

	public static void main(String[] args) {
		String path = "./src/lexer/JFlexLexer.flex";
		generarLexer(path);

	}

	public static void generarLexer(String path) {
		File file = new File(path);
		jflex.Main.generate(file);
	}
}
