package tabparkinggaragepos;
import java.util.Formatter;
/**
 * @author Tyler
 */
public class StartUp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Receipt receipt = new Receipt();     
   Vehicle car = new Vehicle();
   ParkingGarage garage = new ParkingGarage();
   
            
    
        System.out.printf("$%.2f %n", garage.bvgfc.calculateParkingCharge(24.00));
        System.out.printf("$%.2f %n", garage.tgfc.calculateParkingCharge(24.00));
        System.out.println();
   
   
        
       
   

    }
}
