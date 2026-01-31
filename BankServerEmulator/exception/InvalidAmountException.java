package exception;

public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        System.out.println(message);
    }
}
