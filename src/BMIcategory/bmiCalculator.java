package BMIcategory;

public class bmiCalculator {



    private double bmi(double weight, double height){
   double bmi = weight / (height * height);

    if(bmi < 18.5){
       // weight = 50.00;
       // height = 5.80;
        System.out.println("is Underweight");
    } else if(bmi >= 18.5 && bmi <= 24.9){
        System.out.println("normal");
    } else if (bmi >=25 && bmi <= 29.9){
        System.out.println("is overweight");
    } else if (bmi >= 30.0){
        System.out.println("is obese");
    } else {
        System.out.println("does not fall under any cat");
    }
    return bmi;
    }
    public static void main(String[] args) {

        bmiCalculator bmiCalculator = new bmiCalculator();
        System.out.printf("BMI of a person is %.2f%n", bmiCalculator.bmi(55.00, 5.80));
        
    }
    


}




/* Ask for weight (kg) and height (m). Calculate BMI. Use if/else if to print the category:
 Underweight (< 18.5), Normal (18.5-24.9), Overweight (25-29.9), Obese (>= 30). 
 Also print the raw BMI to 2 decimal places */


 