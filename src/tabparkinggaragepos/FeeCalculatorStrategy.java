
package tabparkinggaragepos;
/**
 * This classis all about the flexible implementation of a fee calculator for multiple garages.
 * @author Tyler
 */
public interface FeeCalculatorStrategy {
public abstract void getTimeStamp(String timeIn, String timeOut);
public abstract void calculateParkingCharge(double hoursParked, double minimumFee, double hourlyRate, double maxCharge);
}
