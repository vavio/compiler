package engine;

import java.awt.Dialog;
import java.awt.Dimension;
import java.io.File;
import java.io.PrintWriter;
import java.util.concurrent.Future;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

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

public class Engine {
	static private File file;
	static boolean showParseTree;
	
	static TokenSource lexer;
	static CommonTokenStream commonTokenStream;
	static RoboLParser parser;
	static ErrorContainer errorContainer;
	static ErrorDetector errorDetector; 
	static SemanticAnalyzer semanticAnalyzer;
	static CodeGenerator1 codeGenerator;
	static StartContext tree;
	
	public Engine() {		
	}
	
	private void saveRimalCode() throws Exception{
		String newFilePath = file.getAbsolutePath();
		int pos = newFilePath.lastIndexOf(".");
		if (pos > 0) {
		    newFilePath = newFilePath.substring(0, pos);
		}
		newFilePath = newFilePath + ".rimal";
		
		System.out.println(newFilePath);
		
		PrintWriter out = new PrintWriter(new File(newFilePath), "UTF-8");
		out.write(codeGenerator.toString());
		out.flush();
		out.close();
	}

	public void compile() throws Exception {
		System.out.println(file.getAbsolutePath());
		System.out.println(String.format("%s.tokens", file.getAbsolutePath()));
		
		lexer = new AntlrLexer(file.getAbsolutePath(), String.format("%s.tokens", file.getAbsolutePath()));
		errorContainer = new ErrorContainer();
		commonTokenStream = new CommonTokenStream(lexer);
		parser = new RoboLParser(commonTokenStream);
		parser.setBuildParseTree(true);
		parser.removeParseListeners();
		parser.addErrorListener(new ErrorDetector(errorContainer));
		
		
		tree = parser.start();
		if (showParseTree) {
			Future<JDialog> dialog = tree.inspect(parser);
//			dialog.get().setModal(false);
//			dialog.get().setModalityType(Dialog.ModalityType.MODELESS);
//			dialog.get().setResizable(true);
		}
		
		semanticAnalyzer = new SemanticAnalyzer((AntlrLexer) lexer, errorContainer);
		semanticAnalyzer.visit(tree.getChild(0));
		
		codeGenerator = new CodeGenerator1( (AntlrLexer) lexer);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk((ParseTreeListener) codeGenerator, tree);
		//System.out.println(codeGenerator.generateRimalCode());
		
		if (errorContainer.getErrors().size() == 0) {
			saveRimalCode();
		}
	}

	
	public ErrorContainer getErrorContainer() {
		return errorContainer;
	}

	public File getFile() {
		return file;
	}


	public void setFile(File file) {
		this.file = file;
	}


	public boolean isShowParseTree() {
		return showParseTree;
	}


	public void setShowParseTree(boolean showParseTree) {
		this.showParseTree = showParseTree;
	}
}
