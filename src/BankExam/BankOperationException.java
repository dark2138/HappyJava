package BankExam;

public class BankOperationException extends Exception{
    public BankOperationException() {
    }

    public BankOperationException(String message) {
        super(message);
    }
}
