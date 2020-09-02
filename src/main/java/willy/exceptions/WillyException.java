package willy.exceptions;

/**
 * Handles the errors that may arise in the process of using the bot.
 */
public class WillyException extends Exception {
    private final String style = "\t______________________________________________________________\n";
    private final String error;

    public WillyException(String errorMessage) {
        super(errorMessage);
        this.error = errorMessage;
    }

    @Override
    public String toString() {
        return style + "\t" + error + "\n" + style;
    }
}
