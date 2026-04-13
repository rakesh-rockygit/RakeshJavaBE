public class ProfileCardGenerator {

    public static void main(String[] args) throws Exception {
        String name = "Rakesh";
        int age = 29;
        double height = 1.77;
        boolean student = true;

        // using string format
        String card = String.format(
                "+-------------------------------+\n" +
                        "|Name: %s |\n" +
                        "|age: %d |\n" +
                        "|height: %.2f |\n" +
                        "|student: %b |\n" +
                        "+-----------------------------+",
                name.toUpperCase(), age, height, student);
        System.out.println(card);

    }
}
