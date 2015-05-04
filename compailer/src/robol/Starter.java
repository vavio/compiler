package robol;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.runtime.debug.ParseTreeBuilder;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.runtime.tree.Tree;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.TestRig;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

import robol.RoboLParser.StartContext;
import converter.AntlrLexer;

public class Starter {
	public static void main(String[] args) throws Exception {
		TokenSource lexer = new AntlrLexer("source.robol", "tokens.robol");
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		RoboLParser parser = new RoboLParser(commonTokenStream);
		parser.setBuildParseTree(true);
		//System.out.println(parser.start().toStringTree());
		StartContext c = parser.start();
		c.inspect(parser);
//		ParseTree tree = (ParseTree) c.getChild(0);
//		JFrame frame = new JFrame("Antlr AST");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), (org.antlr.v4.runtime.tree.Tree) tree.getChild(0));
//        viewr.setScale(1.5);//scale a little
//        panel.add(viewr);
//        frame.add(panel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(200,200);
//        frame.setVisible(true);
//        parser.tra
        
//		commonTokenStream.fill();
//		for (Token token : (List<Token>) commonTokenStream.getTokens()) {
//			//System.out.println(token.getText());
//			
//		}
		// Token token = null;
		// while((token = lexer.nextToken()) != null)
		// {
		// //System.out.println(token.getType() + " - " + token.getText());
		// }

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
