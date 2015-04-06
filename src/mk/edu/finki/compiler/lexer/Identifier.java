package mk.edu.finki.compiler.lexer;

public class Identifier {
	private String name;
	private int ID;

	public Identifier(String name, int iD) {
		this.name = name;
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return ID;
	}

}
