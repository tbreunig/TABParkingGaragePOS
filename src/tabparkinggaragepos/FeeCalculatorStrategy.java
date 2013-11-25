package tabparkinggaragepos;

/**
 * Class contains unimplemented abstract methods the will be inherited from
 * other garage calculators
 *
 * @author Tyler
 */
public interface FeeCalculatorStrategy {

    /**
     * Abstract method to be given unique implementation from other garage
     * calculators that use this interface.
     *
     * @param timeIn
     * @param timeOut
     * @return - A calculation that determines the total amount of time parked.
     */
    public abstract double getTimeStamp(double timeIn, double timeOut);

    /**
     * Abstract method to be given unique implementation from other garage
     * calculators that use this interface.
     *
     * @param hoursParked
     * @return - Uniquely calculated parking charge(s) based on a garages fee
     * criteria.
     */
    public abstract double calculateParkingCharge(double hoursParked);
}
