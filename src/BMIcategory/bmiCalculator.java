package BMIcategory;

public class bmiCalculator {

   double weight;
   double height;
   double bmi = weight / (height * height);

    private double bmiCalculator(double bmi){
    if(bmi < 18.5){
        weight = 50.00;
        height = 5.80;
        System.out.println("Underweight");
    } else {
        System.out.println("not");
    }
    return bmi;
    }
    public static void main(String[] args) {

        bmiCalculator bmiCalculator = new bmiCalculator();
        System.out.println(bmiCalculator.bmi);
        
    }
    


}




/* Ask for weight (kg) and height (m). Calculate BMI. Use if/else if to print the category:
 Underweight (< 18.5), Normal (18.5-24.9), Overweight (25-29.9), Obese (>= 30). 
 Also print the raw BMI to 2 decimal places */


 