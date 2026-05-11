package DiscountMethod;

public class Discount {
    int stockCount;
    String name;
    String category;
    double price;

    public Discount(int stockCount, String name, String category, double price) {
        this.stockCount = stockCount;
        this.name = name;
        this.category = category;
        this.price = price;

    }

    public void applyDiscount(double percent) {
        this.price = this.price - (this.price * percent / 100.0);
    }

    public void restock(int quantity) {
        this.stockCount += quantity;
    }

    public String sell(int quantity) {
        if (quantity <= this.stockCount) {
            this.stockCount -= quantity;
            return "stock available";
        } else

        {
            return "error : no stock";
        }
    }

    public String displayInfo() {
        return "stock available is " + stockCount +
                "name is" + name +
                "category type" + category +
                "price of item" + price;
    }

    public static void main(String[] args) {
        Discount dm1 = new Discount(100, "kiwi", "fruit", 1500);
        dm1.sell(10);
        System.out.println(dm1.displayInfo());
    }
}
