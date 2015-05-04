package converter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;


public class AntlrToken implements Token{
	private int type;
	private String text;
	private int line;
	private int startIndex;
	private int stopIndex;
	private int  channel;
	private int index;
	
	public AntlrToken() {
		
	}
	
	public AntlrToken(int type, String text, int line, int startIndex,
			int stopIndex, int channel) {
		super();
		this.type = type;
		this.text = text;
		this.line = line;
		this.startIndex = startIndex;
		this.stopIndex = stopIndex;
		this.channel = channel;
	}


	@Override
	public int getChannel() {
		//System.out.println("Token method: getChannel");
		return channel;
	}

	@Override
	public int getCharPositionInLine() {
		return 0;
	}

	@Override
	public CharStream getInputStream() {
		System.out.println("Unimplemented Token method: getInputStream");
		return null;
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getStartIndex() {
		return startIndex;
	}

	@Override
	public int getStopIndex() {
		return stopIndex;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public int getTokenIndex() {
		System.out.println("Token method: getTokenIndex");
		return index;
	}

	@Override
	public TokenSource getTokenSource() {
		System.out.println("Unimplemented Token method: getTokenSource");
		return null;
	}

	@Override
	public int getType() {
		return type;
	}

	
	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public void setStopIndex(int stopIndex) {
		this.stopIndex = stopIndex;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
