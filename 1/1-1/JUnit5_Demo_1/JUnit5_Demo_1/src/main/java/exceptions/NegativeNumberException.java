package exceptions;
//User defined exception
public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(){
        System.out.println("Number should not be negative");
    }
}
