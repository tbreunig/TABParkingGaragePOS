package tabparkinggaragepos;

/**
 * Class declares all fields and methods for Best Value Garages parking fee
 * calculations.
 *
 * @param timeParked - total time user has been parked
 * @param minimumFee - $2.00 minimum to park UP TO THREE HOURS
 * @param additionalHourlyFee - $0.50 per hour charge for each hour OR part of
 * the hour parked after the minimum has been met
 * @param maxParkTime - No user can park longer than 24 hours at a time
 * @param maxFee - Maximum fee a user can be charged is $10.00
 * @param totalFee - Stores the value for a vehicle's total parking fee.
 *
 * @param timeIn - parameter passed into timeStamp method
 * @param timeOut - parameter passed into timeStamp method
 *
 * @author Tyler
 *
 * GET TIME STAMP & CALCULATE PARKING CHARGE...STILL NEED TO BE OVERRIDDEN.
 *
 */
public class BestValueGarageFeeCalculator implements FeeCalculatorStrategy {

    private double timeParked;
    private double minimumFee = 2.00;
    private double additionalHourlyFee = 0.50;
    private double maxParkTime = 24.00;
    private double maxFee = 10.00;
    private double totalFee = 0;
    private double timeIn;
    private double timeOut;
    private double timeStamp;
    /**
     * Parking Garage.
     *
     * @param garage
     */
    ParkingGarage garage;
    /**
     * Receipt component.
     *
     * @param receipt
     */
    Receipt receipt;

    /**
     * Empty convenience Constructor.
     *
     * @param timeParked - total time user has been parked
     */
    public BestValueGarageFeeCalculator() {
    }

    /**
     * Method calculates the total time parked.
     *
     * @param timeIn
     * @param timeOut
     * @returns - The total time a vehicle has been parked.
     */
    @Override
    public double getTimeStamp(double timeIn, double timeOut) {
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        timeParked += timeOut - timeIn;
        return timeParked;
    }

    /**
     * Method calculates the total charge incurred for a vehicle that has been
     * parked.
     *
     * @param hoursParked
     * @returns - The total charge incurred for parking.
     */
    @Override
    public double calculateParkingCharge(double hoursParked) {
        if (hoursParked <= 3.00) {
            totalFee += minimumFee;
        } else if (hoursParked > 3.00 && hoursParked <= 19.00) {
            totalFee += (minimumFee + ((hoursParked - 3.00) * additionalHourlyFee));
        } else {
            hoursParked += 24.00;
            totalFee += maxFee;
        }
        return totalFee;
    }

    /**
     * Retrieve value for total time parked.
     *
     * @return - The total time parked.
     */
    public double getTimeParked() {
        return timeParked;
    }

    /**
     * Retrieve value for minimum fee.
     *
     * @return - The minimum parking fee.
     */
    public double getMinimumFee() {
        return minimumFee;
    }

    /**
     * Retrieve value for additional hourly fee.
     *
     * @return - The additional hourly fee.
     */
    public double getAdditionalHourlyFee() {
        return additionalHourlyFee;
    }

    /**
     * Retrieve value for maximum time parked.
     *
     * @return - maximum time parked.
     */
    public double getMaxParkTime() {
        return maxParkTime;
    }

    /**
     * Retrieve the maximum for parking.
     *
     * @return - the maximum parking fee.
     */
    public double getMaxFee() {
        return maxFee;
    }

    /**
     * Sets the value for the total time a vehicle has been parked.
     *
     * @param timeParked - Of type Double. Total time a vehicle has been parked.
     */
    public void setTimeParked(double timeParked) {
        this.timeParked = timeParked;
    }

    /**
     * Sets the value for the minimum parking fee.
     *
     * @param minimumFee - Of type Double. The minimum fee for parking.
     */
    public void setMinimumFee(double minimumFee) {
        this.minimumFee = minimumFee;
    }

    /**
     * Sets the value for the additional hourly fee.
     *
     * @param additionalHourlyFee - Of type Double. The additional hourly fee.
     */
    public void setAdditionalHourlyFee(double additionalHourlyFee) {
        this.additionalHourlyFee = additionalHourlyFee;
    }

    /**
     * sets the value of the maximum time parked.
     *
     * @param maxParkTime - Of type Double. The maximum time parked.
     */
    public void setMaxParkTime(double maxParkTime) {
        this.maxParkTime = maxParkTime;
    }

    /**
     * Sets the value of the maximum fee incurred.
     *
     * @param maxFee - Of type Double. The maximum fee incurred.
     */
    public void setMaxFee(double maxFee) {
        this.maxFee = maxFee;
    }

    /**
     * HashCode based on a combination of total time parked, minimum fee,
     * additional hourly fee, maximum time parked, and maximum fee.
     *
     * @return the HashCode
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.timeParked) ^ (Double.doubleToLongBits(this.timeParked) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.minimumFee) ^ (Double.doubleToLongBits(this.minimumFee) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.additionalHourlyFee) ^ (Double.doubleToLongBits(this.additionalHourlyFee) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.maxParkTime) ^ (Double.doubleToLongBits(this.maxParkTime) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.maxFee) ^ (Double.doubleToLongBits(this.maxFee) >>> 32));
        return hash;
    }

    /**
     * Equality is based on a combination of total time parked, minimum fee,
     * additional hourly fee, maximum time parked, and maximum fee.
     *
     * @param obj - Target to test.
     * @return Result of equality test.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BestValueGarageFeeCalculator other = (BestValueGarageFeeCalculator) obj;
        if (Double.doubleToLongBits(this.timeParked) != Double.doubleToLongBits(other.timeParked)) {
            return false;
        }
        if (Double.doubleToLongBits(this.minimumFee) != Double.doubleToLongBits(other.minimumFee)) {
            return false;
        }
        if (Double.doubleToLongBits(this.additionalHourlyFee) != Double.doubleToLongBits(other.additionalHourlyFee)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxParkTime) != Double.doubleToLongBits(other.maxParkTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxFee) != Double.doubleToLongBits(other.maxFee)) {
            return false;
        }
        return true;
    }

    /**
     * Uses all properties of class.
     *
     * @return combination of all property values.
     */
    @Override
    public String toString() {
        return "BestValueGarageFeeCalculator{" + "timeParked=" + timeParked + ", minimumFee=" + minimumFee + ", additionalHourlyFee=" + additionalHourlyFee + ", maxParkTime=" + maxParkTime + ", maxFee=" + maxFee + '}';
    }
}
