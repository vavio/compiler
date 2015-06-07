package error;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorDetector extends BaseErrorListener {
	private ErrorContainer errorContainer;
	
	public ErrorDetector(ErrorContainer errorContainer) {
		super();
		this.errorContainer = errorContainer;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
		errorContainer.addError(new Error(line, charPositionInLine, charPositionInLine, msg, ""));
		super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
	}
}
