public class StringInspector {

    public class CharAtCheck {
        public static void main(String[] args) {

            String word = "Javabackend";

            String uppercaseWord = word.toUpperCase();
            System.out.println(uppercaseWord);

            String lowercaseWord = word.toLowerCase();
            System.out.println(lowercaseWord);

            int length = word.length();
            System.out.println("The length is: " + length);

            char first = word.charAt(word.length() - 1);
            System.out.println(first);

            char last = word.charAt(word.length() - 1);
            System.out.println(last);

            boolean letter = word.contains("a");
            System.out.println(letter);

        }
    }

}
