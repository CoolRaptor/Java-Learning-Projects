import java.util.Scanner;

public class testScores
{
    
    public static void main(String[] args)
 {
    Scanner keyboard = new Scanner(System.in);    
        
    int tests;
    
    System.out.print("How many tests were graded?");
    tests = keyboard.nextInt();
    
    double[] grades = new double[tests];
    
    for (int index = 0; index < tests; index++)
    {
    System.out.print("What grade did test " + (index + 1) + " recieve?");
    grades[index] = keyboard.nextDouble();
    }
    
    for (int index = 0; index < tests; index++)
    {
    System.out.println("Test " + (index + 1) + ": " + grades[index] + "%");
    }
 }
}
