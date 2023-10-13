package Exception;

public class ApplicationNotFound extends Exception {
    public ApplicationNotFound() {
    }

    public ApplicationNotFound(String message) {
        super(message);
    }

    public ApplicationNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationNotFound(Throwable cause) {
        super(cause);
    }

    public ApplicationNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
