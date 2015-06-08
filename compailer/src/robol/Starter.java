package robol;

import java.util.Map;
import java.util.concurrent.Future;

import javax.swing.JDialog;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import codegen.CodeGenerator;
import parser.RoboLParser;
import parser.RoboLParser.StartContext;
import semantics.Procedure;
import semantics.SemanticAnalyzer;
import semantics.Variable;
import converter.AntlrLexer;
import error.ErrorDetector;

public class Starter {
	static SemanticAnalyzer semanticAnalyzer;
	static TokenSource lexer;
	
	public static void main(String[] args) throws Exception {
//		lexer = new AntlrLexer("testErrors1.robol", "tokens.robol");
//		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
//		RoboLParser parser = new RoboLParser(commonTokenStream);
//		parser.setBuildParseTree(true);
//		parser.removeParseListeners();
//		parser.addErrorListener(new ErrorDetector());
//		StartContext tree = parser.start();
//
//		semanticAnalyzer = new SemanticAnalyzer((AntlrLexer) lexer);
//		semanticAnalyzer.visit(tree.getChild(0));
//		
//		CodeGenerator1 codeGenerator = new CodeGenerator1(semanticAnalyzer.getProcedures(), (AntlrLexer) lexer);
//		ParseTreeWalker walker = new ParseTreeWalker();
//		walker.walk((ParseTreeListener) codeGenerator, tree);
//		System.out.println(codeGenerator.generateRimalCode());
		

//
//		Future<JDialog> dialog = tree.inspect(parser);
//		dialog.get().setSize(1200, 800);
		
		
		
		
		// System.out.println(parser.start().toStringTree());
		// ParseTree tree = (ParseTree) c.getChild(0);
		// JFrame frame = new JFrame("Antlr AST");
		// JPanel panel = new JPanel();
		// TreeViewer viewr = new
		// TreeViewer(Arrays.asList(parser.getRuleNames()),
		// (org.antlr.v4.runtime.tree.Tree) tree.getChild(0));
		// viewr.setScale(1.5);//scale a little
		// panel.add(viewr);
		// frame.add(panel);
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(200,200);
		// frame.setVisible(true);
		// parser.tra

		// commonTokenStream.fill();
		// for (Token token : (List<Token>) commonTokenStream.getTokens()) {
		// //System.out.println(token.getText());
		//
		// }
		
		
//		 Token token = null;
//		 while((token = lexer.nextToken()).getType() != Token.EOF)
//		 {
//		 //System.out.println(token.getType() + " - " + token.getText());
//		 }

		// File file = new File("source.robol");
		// FileInputStream fileInputStream = new FileInputStream(file);
		// BufferedReader bufferedReader =new BufferedReader(new
		// InputStreamReader(new FileInputStream(file), "UTF-8"));
		// String line = null;
		// while ((line = bufferedReader.readLine()) != null) {
		// System.out.println(line);
		// }
		// bufferedReader.close();
	}
	
	public static void printAllProcedures()
	{
		System.out.println("---Proceduri---");
		Map<Integer, Procedure> procedures = semanticAnalyzer.getProcedures();
		for (Integer id : procedures.keySet()) {
			Procedure procedure = procedures.get(id);
			System.out.println("Name: " + procedure.getId());
			for (Variable var : procedure.getArguments()) {
				System.out.println("--" + var.getType().name() + " " + var.getId());
			}
			Map<Integer, Variable> variables = procedure.getVariables();
			for (Integer variableId : variables.keySet()) {
				Variable var = variables.get(variableId);
				System.out.println("Name: "  + ((AntlrLexer)lexer).getIIdentifierNameById(var.getId()) + " - " + var.getId() );
				System.out.println("Type: " + var.getType().name());
				System.out.println();
			}
		}
		System.err.println();
	}
//	
//	public static void printAllVariables()
//	{
//		System.out.println("---Promenlivi---");
//		Map<Integer, Variable> variables = semanticAnalyzer.getVariables();
//		for (Integer id : variables.keySet()) {
//			Variable var = variables.get(id);
//			System.out.println("Name: "  + ((AntlrLexer)lexer).getIIdentifierNameById(var.getId()) + " - " + var.getId() );
//			System.out.println("Type: " + var.getType().name());
//			System.out.println("Scope: " + var.getScope());
//			System.out.println();
//		}
//		
//		System.err.println();
//	}
}
