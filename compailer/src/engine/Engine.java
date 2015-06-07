package engine;

import java.io.File;

public class Engine {
	private File file;
	private String souceCode;
	private boolean showParseTree;

	public Engine() {
	}
	
	
	public void open() {
		
	}
	
	public void save() {
		
	}

	public void compile() {

	}


	public File getFile() {
		return file;
	}


	public void setFile(File file) {
		this.file = file;
	}


	public String getSouceCode() {
		return souceCode;
	}


	public void setSouceCode(String souceCode) {
		this.souceCode = souceCode;
	}


	public boolean isShowParseTree() {
		return showParseTree;
	}


	public void setShowParseTree(boolean showParseTree) {
		this.showParseTree = showParseTree;
	}
}
