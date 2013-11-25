package tabparkinggaragepos;

/**
 * Class declares all fields and methods for Thrifty Garages parking fee
 * calculations.
 *
 * @param minimumFee - $1.50 minimum to park UP TO TWO HOURS
 * @param additionalHourlyFee - $0.75 per hour charge for each hour OR part of
 * the hour parked after the minimum has been met
 * @param timeParked - total time user has been parked.
 * @param totalFee - This variable will hold the total parking charge for the
 * user.
 *
 * @author Tyler
 *
 *
 * SHOULD PROBABLY CHANGE THE THROW NEW EXCEPTIONS TO TRY-CATCH BLOCKS
 *
 *
 */
public class ThriftyGarageFeeCalculator implements FeeCalculatorStrategy {

    private double timeParked;
    private double minimumFee = 1.50;
    private double additionalHourlyFee = 0.75;
    private double totalFee;
    /**
     * Parking Garage and Receipt components.
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
     * Empty convenience constructor.
     */
    public ThriftyGarageFeeCalculator() {
    }

    /**
     * Method retrieves the total time a vehicle is parked in the garage.
     *
     * @param timeIn - Time stamp for when a vehicle is checked in.
     * @param timeOut - Time stamp for when a vehicle is checked out.
     * @return - The difference from the timeIn and timeOut, giving you a total
     * time parked.
     */
    @Override
    public double getTimeStamp(double timeIn, double timeOut) {
        return timeOut - timeIn;
    }

    /**
     * Method calculates the total charge for a vehicle that has used a garage.
     *
     * @param hoursParked - Total time a vehicle has been parked.
     * @return - The total charge for a vehicle that has been checked out of the
     * garage.
     */
    @Override
    public double calculateParkingCharge(double hoursParked) {
        if (hoursParked <= 2.00) {
            totalFee += minimumFee;
        } else if (hoursParked > 2.00) {
            totalFee += (minimumFee + ((hoursParked - 2.00) * additionalHourlyFee));
//        } else {
//            hoursParked = 24.00;
//            totalFee += (minimumFee + ((hoursParked - 2.00) * additionalHourlyFee));
        }
        return totalFee;
    }

    /**
     * Retrieves the minimum parking fee.
     *
     * @return - Of type Double. Should be $1.50. Applied to any charged
     * incurred from time equal to or less than 2.0 hours parked.
     */
    public double getMinimumFee() {
        return minimumFee;
    }

    /**
     * Retrieves the additional hourly parking fee.
     *
     * @return - Of type Double. Should be $0.75 for full & partial time above
     * 2.01 hours parked.
     */
    public double getAdditionalHourlyFee() {
        return additionalHourlyFee;
    }

    /**
     * Retrieves the total fee for parking the a vehicle has incurred.
     *
     * @return - Of type double. Total fee combines a calculation of minimum
     * fee, additional hourly fee, and hours parked.
     */
    public double getTotalFee() {
        return totalFee;
    }

    /**
     * Retrieves the total time a vehicle has been parked.
     *
     * @return - Of type Double.
     */
    public double getTimeParked() {
        return timeParked;
    }

    /**
     * Sets the value of the total fee(s) incurred
     *
     * @param minimumFee - Should be 1.50. Applied to any charged incurred
     * within 2.0 hours parked.
     * @throws IllegalArgumentException if total fee and time parked is less
     * than zero.
     */
    public void setMinimumFee(double minimumFee) {
        if (minimumFee < 1.50 || minimumFee > 1.50) {
            throw new IllegalArgumentException("Minimum fee cannot be greater than or less than 1.50");
        }
        this.minimumFee = minimumFee;
    }

    /**
     * @param additionalHourlyFee - Should be 0.50 for time above 2.01 hours
     * parked, up to the max fee. chosen.
     * @throws IllegalArgumentException if total fee and time parked is less
     * than zero.
     */
    public void setAdditionalHourlyFee(double additionalHourlyFee) {
        if (additionalHourlyFee < 0.75 || additionalHourlyFee > 0.75) {
            throw new IllegalArgumentException("Additional hourly fee cannot be greater than or "
                    + "less than 0.75.");
        }

        this.additionalHourlyFee = additionalHourlyFee;
    }

    /**
     * @param totalFee - Any value between the zero and 10.00(maximum fee).
     * @throws IllegalArgumentException if total fee and time parked is less
     * than zero.
     * @throws IllegalArgumentException if total fee and time parked is less
     * than zero.
     */
    public void setTotalFee(double totalFee) {
        if (totalFee < 0) {
            throw new IllegalArgumentException("Fee cannot be a negative value.");
        }
        this.totalFee = totalFee;
    }

    /**
     * @param timeParked - Any value between the value of zero and 24.00(maximum
     * time allowed).
     * @throws IllegalArgumentException if total fee and time parked is less
     * than zero.
     */
    public void setTimeParked(double timeParked) {
        if (timeParked < 0) {
            throw new IllegalArgumentException("Time parked cannot be a negative value. Make sure to use"
                    + "a decimal value (0.00) to denote the time.");
        }
        this.timeParked = timeParked;
    }

    /**
     * HashCode based on a combination of make and model
     *
     * @return the HashCode
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.timeParked) ^ (Double.doubleToLongBits(this.timeParked) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.minimumFee) ^ (Double.doubleToLongBits(this.minimumFee) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.additionalHourlyFee) ^ (Double.doubleToLongBits(this.additionalHourlyFee) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalFee) ^ (Double.doubleToLongBits(this.totalFee) >>> 32));
        return hash;
    }

    /**
     * Equality is based on a combination of time parked, min & max fees,
     * additional hourly fee, and total fee.
     *
     * @param obj - Target to test.
     * @returnr Result of equality test.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThriftyGarageFeeCalculator other = (ThriftyGarageFeeCalculator) obj;
        if (Double.doubleToLongBits(this.timeParked) != Double.doubleToLongBits(other.timeParked)) {
            return false;
        }
        if (Double.doubleToLongBits(this.minimumFee) != Double.doubleToLongBits(other.minimumFee)) {
            return false;
        }
        if (Double.doubleToLongBits(this.additionalHourlyFee) != Double.doubleToLongBits(other.additionalHourlyFee)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalFee) != Double.doubleToLongBits(other.totalFee)) {
            return false;
        }
        return true;
    }

    /**
     * Uses all properties of class
     *
     * @return combination of all property values
     */
    @Override
    public String toString() {
        return "ThriftyGarageFeeCalculator{" + "timeParked=" + timeParked + ", minimumFee="
                + minimumFee + ", additionalHourlyFee=" + additionalHourlyFee
                + ", totalFee=" + totalFee + '}';
    }
}
