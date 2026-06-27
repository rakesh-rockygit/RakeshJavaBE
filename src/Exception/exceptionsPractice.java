package Exception;

public class exceptionsPractice {
        public static void main(String[] args) {
        int[] data = {5, 8, 12, 19};

        try {
            int index = findElement(data, 99); // This target does not exist
            System.out.println("Found at index: " + index);
        } catch (ElementNotFoundException e) {
            System.err.println(e.getMessage()); // Gracefully handles the missing array element
        }
    }
}

