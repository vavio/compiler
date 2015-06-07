package robol;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.swing.JDialog;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import parser.RoboLParser;
import parser.RoboLParser.StartContext;
import semantics.SemanticAnalyzer;
import codegen.CodeGenerator1;
import converter.AntlrLexer;
import error.ErrorContainer;
import error.ErrorDetector;
import gui.GUI;

public class Starter1 {

	
	static TokenSource lexer;
	static RoboLParser parser;
	static ErrorContainer errorContainer;
	static ErrorDetector errorDetector; 
	static SemanticAnalyzer semanticAnalyzer;
	static CodeGenerator1 codeGenerator;
	
	
	public static void main(String[] args) throws Exception {
		GUI gui = new GUI();
//		errorContainer = new ErrorContainer();
//		lexer = new AntlrLexer("testErrors1.robol", "tokens.robol");
//		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
//		parser = new RoboLParser(commonTokenStream);
//		parser.setBuildParseTree(true);
//		parser.removeParseListeners();
//		parser.addErrorListener(new ErrorDetector(errorContainer));
//		
//		StartContext tree = parser.start();
//		semanticAnalyzer.visit(tree.getChild(0));
//		
//		codeGenerator = new CodeGenerator1( (AntlrLexer) lexer);		
//		ParseTreeWalker walker = new ParseTreeWalker();
//		walker.walk((ParseTreeListener) codeGenerator, tree);
//		System.out.println(codeGenerator.generateRimalCode());
//
//		
//		Future<JDialog> dialog = tree.inspect(parser);
//		dialog.get().setSize(1200, 800);
	}

}
