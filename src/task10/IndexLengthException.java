package task10;

public class IndexLengthException extends RuntimeException{

    public IndexLengthException() {
    }

    public IndexLengthException(String message) {
        super(message);
    }

    public IndexLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexLengthException(Throwable cause) {
        super(cause);
    }

    public IndexLengthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
