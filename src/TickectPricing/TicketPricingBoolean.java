package TickectPricing;

import java.util.Scanner;

// Ask for age (int) and isMember (boolean). 
// Compute: isAdult = age >= 18, isSenior = age >= 65, fullPrice = isAdult && isMember&& !isSenior.
//  Print all four booleans and a price: full price = 100, senior/non-member discount = 50, under 18 = 30.
//Hint: Introduce the ternary operator: int price = fullPrice ? 100 : (isSenior ? 50 : 30).This previews conditionals

//class 
public class TicketPricingBoolean {

    // static variable
    public static void main(String[] args) {

        // int age = 19;
        // Instance Object
        Scanner scan = new Scanner(System.in);

        // Instance variable
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();

        boolean isMember = true;
        boolean isAdult = age >= 18;
        boolean isSenior = age >= 65;

        boolean fullPrice = isAdult && isMember && !isSenior;
        // ternary operator
        int price = fullPrice ? 100 : (isSenior ? 50 : 30);

        // method call
        System.out.println("isMember :" + isMember);
        System.out.println("isAdult :" + isAdult);
        System.out.println("isSenior :" + isSenior);
        System.out.println("fullPrice :" + fullPrice);

        System.out.println("price :" + price);
        // scan.close();
    }
}
