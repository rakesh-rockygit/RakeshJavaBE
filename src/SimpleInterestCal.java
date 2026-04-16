public class SimpleInterestCal {

    public static void main(String[] args) {
        double principal = 100.0;
        double rate = 10.0;
        int years = 1;

        double SimpleInterest = (principal * rate * years) / 100;

        double TotalAmount = (principal + rate);

        System.out.println("interest earned: " + SimpleInterest);
        System.out.println("Total amount is: " + TotalAmount);

    }
}
