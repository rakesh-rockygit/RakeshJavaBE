public class LeapYearCheck {
    public static void main(String[] args) {

        int year = 2024;

        boolean Leapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(year + "\n--is a leap year\n" + Leapyear);

    }
}
