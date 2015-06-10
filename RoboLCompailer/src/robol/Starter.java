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
import codegen.CodeGenerator;
import converter.AntlrLexer;
import engine.Engine;
import error.ErrorContainer;
import error.ErrorDetector;
import gui.GUI;

public class Starter {
	// static TokenSource lexer;
	// static RoboLParser parser;
	// static ErrorContainer errorContainer;
	// static ErrorDetector errorDetector;
	// static SemanticAnalyzer semanticAnalyzer;
	// static CodeGenerator codeGenerator;
	
	public static void main(String[] args) throws Exception {
		Engine engine = new Engine();
		GUI gui = new GUI(engine);
//		errorContainer = new ErrorContainer();
//		lexer = new AntlrLexer("testErrors2.robol", "tokens.robol");
//		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
//		parser = new RoboLParser(commonTokenStream);
//		parser.setBuildParseTree(true);
//		parser.removeParseListeners();
//		parser.addErrorListener(new ErrorDetector(errorContainer));
//		
//		StartContext tree = parser.start();
//		Future<JDialog> dialog = tree.inspect(parser);
//		dialog.get().setSize(1200, 800);
//		
//		
//		semanticAnalyzer = new SemanticAnalyzer((AntlrLexer) lexer, errorContainer);
//		semanticAnalyzer.visit(tree.getChild(0));
//		
//		codeGenerator = new CodeGenerator( (AntlrLexer) lexer);		
//		ParseTreeWalker walker = new ParseTreeWalker();
//		walker.walk((ParseTreeListener) codeGenerator, tree);
//		System.out.println(codeGenerator.generateRimalCode());

		//асдсад
	}

}
