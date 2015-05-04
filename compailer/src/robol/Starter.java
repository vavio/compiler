package robol;

import java.util.concurrent.Future;

import javax.swing.JDialog;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;

import parser.RoboLParser;
import parser.RoboLParser.StartContext;
import converter.AntlrLexer;

public class Starter {
	public static void main(String[] args) throws Exception {
		TokenSource lexer = new AntlrLexer("source2.robol", "tokens.robol");
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		RoboLParser parser = new RoboLParser(commonTokenStream);
		parser.setBuildParseTree(true);
		StartContext c = parser.start();
		Future<JDialog> dialog = c.inspect(parser);
		dialog.get().setSize(1200, 800);
		
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
}
