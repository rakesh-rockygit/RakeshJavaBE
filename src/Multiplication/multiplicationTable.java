package Multiplication;

public class multiplicationTable {

   //  Ask the user for a number (int). 
    // Print the full multiplication table for that number from 1 to 12. 
    // Format each line as: '5 x 1 = 5', '5 x 2 = 10', etc.

public void multiply(int n){



    for (int i = 1; i <= 12; i++){
    
    System.out.println(n + " * " + i + " = " + (n * i));

   //System.out.println("5 table : " + multiply(5));
   //return n;

}
}


public static void main(String[] args) {
    multiplicationTable multiplicationtable = new multiplicationTable();
    multiplicationtable.multiply(10);
   // System.out.println(n + " * " + i + " = " + (n * i));
  
}
}

