import java.util.Scanner;

public class sums
{
   public static void main(String[] args)
   {
    Scanner keyboard = new Scanner(System.in);  
    
    int sum = 0, count;
       
    System.out.print("Please enter a positive nonzero interger ");
    int num = keyboard.nextInt();
    
    if (num > 0)
    {
        for (count = 1; count <= num; count++)
        {
            sum += count;
           
        }
        
        System.out.println("The sum of the numbers between 1 & "+ num +" is "+ sum +".");
    }
    else
        System.out.println("Invalid Number.");
}
}