import java.util.Scanner;

public class scoresANDgrades
{
   
    public static void main(String[] args)
    {
     
     double test1, test2, test3;
     
     Scanner keyboard = new Scanner(System.in);
     
     System.out.print("Enter your first test score.");
     test1 = keyboard.nextDouble();
     
     System.out.print("Enter your second test score.");
     test2 = keyboard.nextDouble();
        
     System.out.print("Enter your third test score.");
     test3 = keyboard.nextDouble();
     
     double average = (test1+test2+test3)/3;
     
     
     if (average < 60)
     {       System.out.println(" Your average is " + average + 
                               ".\nYour grade is F.");
                            }
     else if (average >= 60 && average < 70 )
     {       System.out.println(" Your average is " + average + 
                               ".\nYour grade is D.");   
                            }
     else if (average >= 70 && average < 80 )
     {       System.out.println(" Your average is " + average + 
                               ".\nYour grade is C."); 
                            }                          
     else if (average >= 80 && average < 90 )
     {       System.out.println(" Your average is " + average + 
                               ".\nYour grade is B.");  
                            }                          
     else if (average >= 90 && average <= 100 )
     {       System.out.println(" Your average is " + average + 
                               ".\nYour grade is A."); 
                            }                          
     else 
     {       System.out.println("Invalid test scores.");
            
        }       
    }

    
}
