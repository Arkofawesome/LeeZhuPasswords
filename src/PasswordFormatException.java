public class PasswordFormatException extends RuntimeException {
    public PasswordFormatException(String message) {
        super(message);
    }
    public PasswordFormatException() {
        super();
    }

    public PasswordFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordFormatException(Throwable cause) {
        super(cause);
    }
}
