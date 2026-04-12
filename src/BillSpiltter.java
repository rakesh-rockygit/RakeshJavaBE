public class BillSpiltter {
    public static void main(String[] args) throws Exception {

        double totalrestaurantbill = 500;

        int people = 3;

        double share = totalrestaurantbill / people;

        int roundedShare = (int) Math.round(share);

        System.out.println("EachPersonShare: " + share);

        System.out.println("RoundShare: " + roundedShare);
    }
}
