import java.util.Scanner;

public class carSales
{
   
    public static void main (String[] args)
    {
    double cars, cost, total, average, count;
    
    total = 0;
    
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("How many cars did you sell this month?");
    cars = keyboard.nextDouble();
    
    while (cars < 0)
    {
        System.out.print("Invalid number. How many cars did you sell this month?");
        cars = keyboard.nextDouble();
    }
    for(count = 1; count <= cars; count++)
    {
        System.out.print("How much did car "+count+" cost?");
        cost = keyboard.nextDouble();
        
        total += cost;
        
        
    }
    
    average = total / cars;
    
    
    
    System.out.println("You sold " + cars + " cars this month."+
                       "\nThe aveage sale was for $" + average + "."+
                       "\nYour total sales for the month were $" + total +".");
                      
    
    }
}
