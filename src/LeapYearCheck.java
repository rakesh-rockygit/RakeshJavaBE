import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Iteration " + i + ": Enter a year to check: ");
            int year = scanner.nextInt();

            boolean Leapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            System.out.println(year + "\n--is a leap year\n" + Leapyear);
            scanner.close();
        }
    }
}