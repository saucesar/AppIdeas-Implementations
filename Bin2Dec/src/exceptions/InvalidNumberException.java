package exceptions;

public class InvalidNumberException extends Exception{
    @Override
    public String getMessage() {
        return "Enter only 0's and 1's";
    }
}
