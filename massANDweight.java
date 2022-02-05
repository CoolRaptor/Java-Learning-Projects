import java.util.Scanner;

public class massANDweight
{
    
    public static void main(String[] args)
    {
     double weight, mass;
     
     
     Scanner keyboard = new Scanner(System.in);
     
     System.out.print("What is the object's mass in kg?");
     mass = keyboard.nextDouble();
     
     weight = mass * 9.8;
     
     if (weight > 1000)
    {   System.out.println("The object is too heavy.");
        
    }
    
    else if (weight >= 10 && weight <= 1000)
    {    System.out.println("The object weighs " + weight +
                            " Newtons, and that fine.");
    }
    
    else if (weight < 10)
    {   System.out.println("The object is too light.");
       
    }
    
    else 
    {   System.out.println("Invalid"); 
    }
}
}