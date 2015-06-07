package error;

public class Error {
	private int line;
	private int startIndex;
	private int stopIndex;
	private String description;
	private String suggestion;

	public Error() {
		// TODO Auto-generated constructor stub
	}

	public Error(int line, int startIndex, int stopIndex, String description, String suggestion) {
		super();
		this.line = line;
		this.startIndex = startIndex;
		this.stopIndex = stopIndex;
		this.description = description;
		this.suggestion = suggestion;
	}
	
	@Override
	public String toString() {
		return String.format("Линија: %d. Грешка: %s Предлог: %s", line, description, suggestion);
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getStopIndex() {
		return stopIndex;
	}

	public void setStopIndex(int stopIndex) {
		this.stopIndex = stopIndex;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

}
