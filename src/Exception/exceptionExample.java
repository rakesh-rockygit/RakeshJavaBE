package Exception;

public class exceptionExample {
    
    public static void main(String[] args) {
        try {
            int data = 10 / 0;                        // Throws ArithmeticException
            System.out.println("This text will not print.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());
        } finally {
            System.out.println("The finally block always executes.");
        }
        System.out.println("The rest of the program continues normally...");
    }
}

