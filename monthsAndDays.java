import java.util.Scanner;

public class monthsAndDays
{
    
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      
      String[] month = {"January", "February", "March", "April", "May", "June",
                        "July", "August", "September", "October", "November", "December" };
                        
      int[] days = { 31, 28, 31, 30, 31, 30,
                     31, 31, 30, 31, 30, 31 };
                     
      int whichMonth;
      
      System.out.print("Which month would you like to know the number of days?(Please enter 1-12)");
      whichMonth = keyboard.nextInt();
      
      while (whichMonth < 1 || whichMonth > 12)
      {
          System.out.print("Invalid number, please enter a number between 1 and 12.");
          whichMonth = keyboard.nextInt();
        }
                        
       whichMonth--;
       
       System.out.println(month[whichMonth] +" has " + days[whichMonth] + " days in it.");          
                      
    }

}
