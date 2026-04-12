public class ProfileCardGenerator {
    public static void main(String[] args) throws Exception {
        String name = "Rakesh";
        int age = 29;
        double height = 1.77;
        boolean student = true;

        // using string format
        String card = String.format(
                "+-------------------------------+\n" +
                        "|Name: %-32s |\n" +
                        "|age: %-28d |\n" +
                        "|height: %-28f |\n" +
                        "|student: %-28b |\n" +
                        "+-----------------------------+",
                name.toUpperCase(), age, height, student);
        System.out.println(card);

    }
}
