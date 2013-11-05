package tabparkinggaragepos;
/**
 *This class will declare the variables that determine the parameter for Best Value Garages
 * parking fees.
 * @param timeParked - total time user has been parked
 * @param minimumFee - $2.00 minimum to park UP TO THREE HOURS
 * @param additionalHourlyFee - $0.50 per hour charge for each hour OR part of the hour parked after the
 *                                                  minimum has been met
 * @param maxParkTime - No user can park longer than 24 hours at a time
 * @param maxFee - Maximum fee a user can be charged is $10.00
 * @author Tyler
 */
public class BestValueGarageFeeCalculator implements FeeCalculatorStrategy {
    
    private double timeParked;
    private double minimumFee = 2.00;
    private double additionalHourlyFee = 0.50;
    private double maxParkTime = 24.00;
    private double maxFee = 10.00;
    private double totalFee;

    /**
     * @param timeParked - total time user has been parked
     */
    public BestValueGarageFeeCalculator(double timeParked) {
        this.timeParked = timeParked;
    }
    
    /*
     * Methods from the FeeCalculatorStrategy interface to be overridden
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
     *  Get and Set timeParked
     */
    public double getTimeParked() {
        return timeParked;
    }

    public void setTimeParked(double timeParked) {
        this.timeParked = timeParked;
    }

    /*
     * Get and Set mimimumFee
     */
    public double getMinimumFee() {
        return minimumFee;
    }

    public void setMinimumFee(double minimumFee) {
        this.minimumFee = minimumFee;
    }

    /*
     * Get and Set additionaHourlyFee
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
      * Get and Set maxFee
      */
    public double getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(double maxFee) {
        this.maxFee = maxFee;
    }

    /*
     * Required HashCode method
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
    
    /*
     *Required toString method 
     */
   @Override
    public String toString() {
        return "BestValueGarageFeeCalculator{" + "timeParked=" + timeParked + ", minimumFee=" + minimumFee + ", additionalHourlyFee=" + additionalHourlyFee + ", maxParkTime=" + maxParkTime + ", maxFee=" + maxFee + '}';
    }

}
