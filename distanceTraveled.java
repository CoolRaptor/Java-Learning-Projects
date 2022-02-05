import java.util.Scanner;

public class distanceTraveled
{
    

    
    public static void main(String[] args)
    {
        int speed, time, distance, count;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("How fast are you planning to go?(In mph)");
        speed = keyboard.nextInt();
        
        while (speed < 0)
        {
            System.out.print("INVALID SPEED. Please enter a speed greater than zero.");
            speed = keyboard.nextInt();
        }
     
        System.out.print("How many hours are you planning to go?(minimum 1 hour)");
        time = keyboard.nextInt();
        
        while (time < 1)
        {
            System.out.print("INVALID NUMBER OF HOURS. Please enter 1 or more hours.");
            time = keyboard.nextInt();
        }
        System.out.println("Hour           Distance Traveled (in miles)\n"
                          +"-------------------------------------------");
                          
        for(count = 1; count <= time; count++)
        {
        distance = speed * count;
        
        System.out.println(count +"               "+ distance);
        }
    }

  
}
