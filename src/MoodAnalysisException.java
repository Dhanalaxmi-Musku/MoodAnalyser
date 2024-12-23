public class MoodAnalysisException extends Exception {
    public enum ErrorType {NULL, EMPTY}

    private ErrorType errorType;

    public MoodAnalysisException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
