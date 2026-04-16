
public class OddEven {
    public static void main(String[] args) {
        int num = 10;

        if (num % 2 == 0) {
            System.out.println("isEven");
        } else {
            System.out.println("isOdd");
        }
        {
            int remainder = num % 2;
            System.out.println("The remainder when divided by 2 is: " + remainder);

        }
    }
}
