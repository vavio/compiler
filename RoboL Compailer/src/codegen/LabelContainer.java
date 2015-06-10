package codegen;

import org.antlr.v4.misc.Graph.Node;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LabelContainer implements TerminalNode {

	String startLabel, endLabel, type;


	public LabelContainer(String startLabel, String endLabel, String type) {
		this.startLabel = startLabel;
		this.endLabel = endLabel;
		this.type = type;
	}

	public String getStartLabel() {
		return startLabel;
	}

	public void setStartLabel(String startLabel) {
		this.startLabel = startLabel;
	}

	public String getEndLabel() {
		return endLabel;
	}

	public void setEndLabel(String endLabel) {
		this.endLabel = endLabel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public <T> T accept(ParseTreeVisitor<? extends T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParseTree getChild(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParseTree getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toStringTree(Parser arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interval getSourceInterval() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getPayload() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toStringTree() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Token getSymbol() {
		// TODO Auto-generated method stub
		return null;
	}


}
