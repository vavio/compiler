package semantics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Procedure {
	private int id;
	private List<Variable> arguments;
	private Map<Integer, Variable> variables;

	public Procedure() {
		arguments = new ArrayList<Variable>();
		variables = new HashMap<Integer, Variable>();
	}

	public Procedure(int id) {
		this();
		this.id = id;
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

	public List<Variable> getArguments() {
		return arguments;
	}

	public void setArguments(List<Variable> arguments) {
		this.arguments = arguments;
	}

	public Map<Integer, Variable> getVariables() {
		return variables;
	}

	public void setVariables(Map<Integer, Variable> variables) {
		this.variables = variables;
	}
}
