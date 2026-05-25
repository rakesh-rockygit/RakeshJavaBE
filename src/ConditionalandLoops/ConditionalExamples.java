package ConditionalandLoops;

public class ConditionalExamples {


    public static void main(String[] args){
        productInfo("A");
    }
    

/* Ask the user to enter a product code (A1, B2, C3). 
Use if/else if/else to print the product name and price.
 If the code is unknown, print 'Invalid code'. Test with valid and invalid codes */

public static void productInfo(String productCode){
    String productName = "";
    double price = 0;

    if(productCode.equals ("A")){
        productName = " Coke ";
        price = 1.50;
    }else if(productCode.equals ("B")){
            productName = " Lays ";
            price = 2.00;
    }else if(productCode.equals ("C")){
             productName = " kikat ";
             price = 2.49;
    } else {
        System.out.println("productCode not available for product");
    }

    System.out.println("productName " + productName + "price " + price );
}


}
