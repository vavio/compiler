package converter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import lexer.JFlexLexer;
import lexer.JFlexToken;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;

public class AntlrLexer implements TokenSource{
	public String inputFile;
	public String outputFile;

	Map<String, Integer> identifierMap;
	BufferedReader in;
	BufferedWriter out;
	JFlexLexer lexer;
	private int identifierId;
	private int tokenIndex;
	
	public AntlrLexer(String inputFile, String outputFile) throws Exception{
		this.inputFile = inputFile;
		this.outputFile = outputFile;
		if (outputFile==null || outputFile.isEmpty()) {
			outputFile = "tokens.out";
		}
		identifierId = 0;
		tokenIndex = 0;
		identifierMap = new HashMap<String, Integer>();
		in = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));
		out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"));
		lexer = new JFlexLexer(in);
	}

	@Override
	public int getCharPositionInLine() {
		System.out.println("Unimplemented Lexer method: getCharPositionInLine");
		return 0;
	}

	@Override
	public CharStream getInputStream() {
		System.out.println("Unimplemented Lexer method: getInputStream");
		return null;
	}

	@Override
	public int getLine() {
		System.out.println("Unimplemented Lexer method: getLine");
		return 0;
	}

	@Override
	public String getSourceName() {
		System.out.println("Unimplemented Lexer method: getSourceName");
		return null;
	}

	@Override
	public TokenFactory<?> getTokenFactory() {
		System.out.println("Unimplemented Lexer method: getTokenFactory");
		return null;
	}

	@Override
	public Token nextToken() {
		JFlexToken oldToken = null;
		AntlrToken newToken = null;
		
		try {
			oldToken = lexer.yylex();
			if (oldToken != null) {
				if (oldToken.getValue() == JFlexToken.ID.getValue()) {
					if (identifierMap.get(lexer.leksema) == null) {
						identifierMap.put(lexer.leksema, identifierId++);
					}
					out.write(String.format("%s\t%d\tline=%d column=%d\n", oldToken.toString(), identifierMap.get(lexer.leksema), lexer.line, lexer.column));
					newToken = new AntlrToken(oldToken.getValue(), identifierMap.get(lexer.leksema).toString(), lexer.line, lexer.column, lexer.column + lexer.leksema.length(),0 );
				} else {
					out.write(String.format("%s\t%s\tline=%d column=%d\n", oldToken.toString(), lexer.leksema, lexer.line, lexer.column));
					newToken = new AntlrToken(oldToken.getValue(), lexer.leksema, lexer.line, lexer.column, lexer.column + lexer.leksema.length(),0 );
				}
				newToken.setIndex(tokenIndex);
				tokenIndex++;
				out.flush();
			}
			else {
				newToken = new AntlrToken(Lexer.EOF, "End of file", 0, 0, 0, 0);
			}
			System.out.println(newToken.getType() + " - " + newToken.getText());
			return newToken;
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	public void setTokenFactory(TokenFactory<?> arg0) {
		System.out.println("Unimplemented Lexer method: setTokenFactory");
	}

}
