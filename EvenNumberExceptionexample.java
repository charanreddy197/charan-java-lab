public class EvenNumberExceptionexample {

    public static void checkNumber(int number) throws EvenNumberException {
        if (number % 2 == 0) {
            throw new EvenNumberException("Even number is not allowed: " + number);
        } else {
            System.out.println("The number is odd: " + number);
        }
    }
     public static void main(String[] args) {
        try {
            checkNumber(4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class EvenNumberException extends Exception {
    public EvenNumberException(String message) {
        super(message);
    }
}
// write a java progra, to create a method that takes integer and throws a exception if the number is even 
// write a java program to create a method that reads a file and throws an exception if the file is not found
// writea java program to handle arthimetic exception using  try, catch and final
//





