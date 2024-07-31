
// Write a Java program that throws an exception and catch it using a try-catch block.


public class Exceptions {
    public static void main(String[] args) {
        try {
            // throw exception
            throwException();
        } catch (Exception e) {
            // catch and handle
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void throwException() throws Exception {
        throw new Exception("Message");
    }
}