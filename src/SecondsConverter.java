
import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalSeconds = 3725;

        System.out.print(" Number of seconds = 3725 to ");
        System.out.print(" hours: minutes: seconds is ");

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%02d: %02d: %02d\n", hours, minutes, seconds);

        scanner.close();
    }

}
