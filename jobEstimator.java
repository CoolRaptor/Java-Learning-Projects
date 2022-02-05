import javax.swing.JOptionPane;
public class jobEstimator
{
    public static void main(String[] args)
    {
        double paintPrice, roomNum, wallSpace, gallons, labor;
        double paintCost, laborCost, totalCost;
                
        paintPrice = getPaintPrice();
        
        roomNum = getRoomNum();
        
        wallSpace = totalWallSpace(roomNum);
        
        gallons = getGallons(wallSpace);
        
        labor = getLabor(wallSpace);
        
        paintCost = getPaintCost(gallons, paintPrice);
        
        laborCost = getLaborCost(labor);
        
        totalCost = getTotal(paintCost, laborCost);
        
        displayData(gallons, labor, paintCost, laborCost, totalCost);
        System.exit(0);
        
    }

    
    public static double getPaintPrice()
       {
        String input;
        double getPaint;
        
        input = JOptionPane.showInputDialog(
                "How much does your paint cost per gallon?");
        
        getPaint = Double.parseDouble(input);
        
        return getPaint;
                   }
    public static double getRoomNum()
    {
        String input;
        double getRooms;
        
        input = JOptionPane.showInputDialog(
                "How many rooms are you painting?");
                
        getRooms = Double.parseDouble(input);
        
        return getRooms;
    }
    public static double totalWallSpace(double rooms)
    {   
        int count;
        double getSpace = 0;
        
            for(count = 1; count <= rooms; count++)
            {
                String input;
                
                input = JOptionPane.showInputDialog(
                        "How many square feet do you want painted in room " + count + "?");
                        
                getSpace += Double.parseDouble(input);        
            }   
        
        return getSpace;    
    }
    public static double getGallons(double wallSpace)
    {
        return wallSpace / 115;
    }
    public static double getLabor(double wallSpace)
    {
        return wallSpace / 115 * 8;
    }
    public static double getPaintCost(double gallons, double paintPrice)
    {
        return gallons * paintPrice;
    }
    public static double getLaborCost(double labor)
    {
        return labor * 18;
    }
    public static double getTotal(double paintCost, double laborCost)
    {
        return paintCost + laborCost;
    }
    public static void displayData(double gallons, double labor, double paintCost, double laborCost, double totalCost)
    {
     JOptionPane.showMessageDialog(null,
                    String.format("You will need %,.2f gallons of paint." +
                                  "\nIt will take %,.2f hours of labor to complete." +
                                  "\nThe paint will cost $%,.2f." +
                                  "\nThe labor will cost $%,.2f." +
                                  "\nThe total cost to you to complete this project will be $%,.2f.",
                                  gallons, labor, paintCost, laborCost, totalCost));
                                  
                                  
    }
   
}
