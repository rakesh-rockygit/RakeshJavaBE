package Addingdigits;

public class combineDigits {
    
    
private int SumofDigitss(int number){
    
int SumofDigitss = 0;
int tempNumber = number;

while(number > 0){
    int digit = number % 10;
    SumofDigitss = SumofDigitss + digit;
    number = number/10;

}
System.out.println("sum of didgits of the " + tempNumber + " : " + SumofDigitss );
return SumofDigitss;
} 
    public static void main(String[] args) {

        combineDigits sumofDigitsss = new combineDigits();

        System.out.println(sumofDigitsss.SumofDigitss(9859));
    }
}
