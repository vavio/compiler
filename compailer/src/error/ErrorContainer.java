package error;

import java.util.ArrayList;
import java.util.List;

public class ErrorContainer {
	private List<Error> errors;
	
	public ErrorContainer() {
		errors = new ArrayList<>(100);
	}
	
	public void addError(Error error) {
		errors.add(error);
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}
}
