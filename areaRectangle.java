
import javax.swing.JOptionPane;

public class areaRectangle
{
    
  public static void main(String[] args)
    {
     double length, width, area;
     
     length = getLength();
     
     width = getWidth();
     
     area = getArea(length, width);
     
     displayData(length, width, area);
     System.exit(0);
       
      
    }
        public static double getLength()
    {
        String input;
        double numLength;
        
        input = JOptionPane.showInputDialog(
                "How long is the rectangle in centimeters?");
                
        numLength = Double.parseDouble(input);
        
        return numLength;
    }
  public static double getWidth()
    {
        String input;
        double numWidth;
        
        input = JOptionPane.showInputDialog(
                "How wide is the rectangle in centimeters?");
                
        numWidth = Double.parseDouble(input);
        
        return numWidth;
    }
  public static double getArea(double arg1, double arg2)
    {
        return arg1 * arg2;
    }
  public static void displayData(double length, double width, double area)
  {
        JOptionPane.showMessageDialog(null, "The rectangle is " + length + " centimeters long." +
                                "\nThe rectangle is " + width + " centimeters wide." +
                                "\nThe rectangle has an area of " + area + " cubic centimeters.");
  }
  
      
    }

