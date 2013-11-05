package tabparkinggaragepos;
/**
 *This class will declare the variables that determine the parameter for Best Value Garages
 * parking fees.
 * @param minimumFee - $1.50 minimum to park UP TO TWO HOURS
 * @param additionalHourlyFee - $0.75 per hour charge for each hour OR part of the hour parked after the
 *                                                  minimum has been met
 * @param maxParkTime - No user can park longer than 24 hours at a time.
 * @param timeParked - total time user has been parked.
 * @param totalFee - This variable will hold the total parking charge for the user.
 * @author Tyler
 */
public class ThriftyGarageFeeCalculator implements FeeCalculatorStrategy {
    
    private double timeParked;
    private double minimumFee = 1.50;
    private double additionalHourlyFee = 0.50;
    private double maxParkTime = 24.00;
    private double totalFee;

    /*
     * @param timeParked - Total time the user has been parked
     */
    public ThriftyGarageFeeCalculator(double timeParked) {
          this.timeParked = timeParked; 
    }

    /*
     * Methods from the feeCalculatorStrategy interface that will be overridden
     */
    @Override
    public void getTimeStamp(String timeIn, String timeOut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calculateParkingCharge(double hoursParked, double minimumFee, double hourlyRate, double maxCharge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
     * Get and Set timeParked
     */
    public double getTimeParked() {
        return timeParked;
    }

    public void setTimeParked(double timeParked) {
        this.timeParked = timeParked;
    }

    /*
     * Get and Set minimumFee
     */
    public double getMinimumFee() {
        return minimumFee;
    }

    public void setMinimumFee(double minimumFee) {
        this.minimumFee = minimumFee;
    }

    /*
     * Get and Set additionalHourlyFee
     */
    public double getAdditionalHourlyFee() {
        return additionalHourlyFee;
    }

    public void setAdditionalHourlyFee(double additionalHourlyFee) {
        this.additionalHourlyFee = additionalHourlyFee;
    }

    /*
     * Get and Set maxParkTime
     */
    public double getMaxParkTime() {
        return maxParkTime;
    }

    public void setMaxParkTime(double maxParkTime) {
        this.maxParkTime = maxParkTime;
    }
    
    /*
     * Get and Set totalFee
     */
    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    /*
     * Required HashCode method
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.timeParked) ^ (Double.doubleToLongBits(this.timeParked) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.minimumFee) ^ (Double.doubleToLongBits(this.minimumFee) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.additionalHourlyFee) ^ (Double.doubleToLongBits(this.additionalHourlyFee) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.maxParkTime) ^ (Double.doubleToLongBits(this.maxParkTime) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.totalFee) ^ (Double.doubleToLongBits(this.totalFee) >>> 32));
        return hash;
    }

    /*
     * Required equals method
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
        if (Double.doubleToLongBits(this.maxParkTime) != Double.doubleToLongBits(other.maxParkTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalFee) != Double.doubleToLongBits(other.totalFee)) {
            return false;
        }
        return true;
    }

    /*
     * Required toString method
     */
    @Override
    public String toString() {
        return "ThriftyGarageFeeCalculator{" + "timeParked=" + timeParked + ", minimumFee=" + minimumFee + ", additionalHourlyFee=" + additionalHourlyFee + ", maxParkTime=" + maxParkTime + ", totalFee=" + totalFee + '}';
    }
    
}
