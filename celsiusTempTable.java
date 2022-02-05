
public class celsiusTempTable

{
       public static void main (String[] args)
       {
        double fahrenheit, celsiusTemp;
        
        System.out.println("Fahrenheit       Celsius" + 
                           "\n------------------------");
        for(fahrenheit = 0; fahrenheit <= 20; fahrenheit++)
            {
                celsiusTemp = celsius(fahrenheit);
                
                System.out.printf(
                            "   %,.2f            %,.2f\n",fahrenheit, celsiusTemp);
                
                
            }
            
                 }
       public static double celsius(double fahrenheit)
       {
        return (fahrenheit - 32) * 5 / 9;   
       }
        
    }
