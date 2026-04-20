import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitalClockConverter {
    // public static void main(String[] args) {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter seconds:");
        // int secs = get.totalseconds();
        String input = reader.readLine();
        int seconds = Integer.parseInt(input);

        int hours = seconds / 3600;
        int minutes = (seconds % 3600);
        // int second = seconds % 60;

        System.out.printf("%d:%02d:%02d", hours, minutes);

    }

}
