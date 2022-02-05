import java.util.Scanner;

public class BMI
{
   
    public static void main(String[] args)
    {
     double weight, height;
     
     Scanner keyboard= new Scanner(System.in);
     
     System.out.print("Enter your weight in pounds.");
     weight = keyboard.nextDouble();
     
     System.out.print("Enter your height in inches.");
     height = keyboard.nextDouble();
     
     double BMI = weight * 703 / (Math.pow(height,2));
     
     if (BMI < 18.5)
        System.out.println("You are underweight.");
        
     else if (BMI > 25)
        System.out.println("You are overweight.");
        
     else 
        System.out.println("Your weight is optimal for your height.");
        
        
    }

}
