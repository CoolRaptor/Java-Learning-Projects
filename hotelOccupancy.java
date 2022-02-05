import java.util.Scanner;

public class hotelOccupancy
{
   
    public hotelOccupancy()
    {
    double floors, occupied, vacant, total, count, floorTotal;
    double occupancyRate;
    
    total = 0;
    
    occupied = 0;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("How many floors does the hotel have?");
    floors = keyboard.nextDouble();
    
    while (floors < 1)
    {
        System.out.print("Invalid number of floors. How many floors are there?");
        floors = keyboard.nextDouble();
    }
    for(count = 1; count <= floors; count++)
    {
        System.out.print("How many rooms are there on floor "+count+"?");
        floorTotal = keyboard.nextDouble();
        while(floorTotal < 10)
        {
            System.out.print("Each floor must have 10 or more rooms.\n"+
                             "How many rooms are on floor "+count+"?");
            floorTotal = keyboard.nextDouble();                 
        }
        total += floorTotal;
        System.out.print("How many rooms on floor "+count+" are occupied?");
        occupied += keyboard.nextDouble();
        
    }
    
    vacant = total - occupied;
    
    occupancyRate = occupied / total;
    
    System.out.println("Total number of rooms: " + total +
                       "\nOccupied Rooms: " + occupied + 
                       "\nVacant Rooms: " + vacant +
                       "\nHotel Occupancy Rate: "+ occupancyRate*100 +"%");
    
    }
}
