package task10;

public class NegativeIndexException extends RuntimeException{
    public NegativeIndexException() {
    }

    public NegativeIndexException(String message) {
        super(message);
    }

    public NegativeIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeIndexException(Throwable cause) {
        super(cause);
    }

    public NegativeIndexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
