package TickectPricing;

import java.util.Scanner;

// Ask for age (int) and isMember (boolean). 
// Compute: isAdult = age >= 18, isSenior = age >= 65, fullPrice = isAdult && isMember&& !isSenior.
//  Print all four booleans and a price: full price = 100, senior/non-member discount = 50, under 18 = 30.
//Hint: Introduce the ternary operator: int price = fullPrice ? 100 : (isSenior ? 50 : 30).This previews conditionals

public class TicketPricingBoolean {

    public static void main(String[] args) {

        // int fullPrice = 100;
        // int age = 19;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scan.nextInt();

        boolean isMember = true;
        boolean isAdult = age >= 18;
        boolean isSenior = age >= 65;

        boolean fullPrice = isAdult && isMember && !isSenior;

        int price = fullPrice ? 100 : (isSenior ? 50 : 30);

        System.out.println("isMember :" + isMember);
        System.out.println("isAdult :" + isAdult);
        System.out.println("isSenior :" + isSenior);
        System.out.println("fullPrice :" + fullPrice);

        System.out.println("price :" + price);
        scan.close();
    }
}
