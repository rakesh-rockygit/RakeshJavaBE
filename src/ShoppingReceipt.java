public class ShoppingReceipt {
    public static void main(String[] args) {
        // Constant Tax Rate (18%)
        final double TAX_RATE = 0.18;

        String product1Name = "coffee";
        double product1Price = 19.99;

        String product2Name = "sugar";
        double product2Price = 5.50;

        String product3Name = "cup";
        double product3Price = 10.00;

        // Calculations
        double subtotal = product1Price + product2Price + product3Price;
        double taxAmount = subtotal * TAX_RATE;
        double total = subtotal + taxAmount;

        // Print Receipt
        System.out.println("--- Receipt ---");

        System.out.println(product1Name + ": $" + product1Price);
        System.out.println(product2Name + ": $" + product2Price);
        System.out.println(product3Name + ": $" + product3Price);

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax (18%%): $%.2f%n", taxAmount);

        System.out.println("---------------");
        System.out.printf("Total:    $%.2f%n", total);
    }
}
