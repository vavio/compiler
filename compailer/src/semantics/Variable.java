package semantics;

public class Variable {
	private int id;
	private VariableType type;
	private Procedure parent;

	public Variable() {
		// TODO Auto-generated constructor stub
	}

	public Variable(int id, VariableType type, Procedure parent) {
		super();
		this.id = id;
		this.type = type;
		this.parent = parent;
	}

	@Override
	public int hashCode() {
		return id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public VariableType getType() {
		return type;
	}

	public void setType(VariableType type) {
		this.type = type;
	}

	public Procedure getParent() {
		return parent;
	}

	public void setParent(Procedure parent) {
		this.parent = parent;
	}
}
