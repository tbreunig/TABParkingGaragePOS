package tabparkinggaragepos;
/**
 * Class defines abstract methods that can be implemented by many different garages that 
 * hold varying identifying characteristics.
 * @author Tyler
 */
public interface ParkingGarageStrategy {
    
  public abstract void setGarageName(String garageName);
  public abstract String getGarageName();
  
  public abstract void setGarageAddress(String garageAddress);
  public abstract String getGarageAddress();
  
  public abstract void setGaragePhoneNumber(String garagePhoneNumber );
  public abstract String getGaragePhoneNumber();
 
}
