package tabparkinggaragepos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class contains all fields and methods pertaining to the output of a
 * receipt for a vehicle that has used a garage; All field information will be
 * listed on the outputted receipt.
 *
 * @param customerNumber - Of type int. Holds the value for a customer ID
 * number.
 * @param dateAndTime - Of type String. Holds the format criteria for the date
 * and time.
 * @param currentDate - Of type Date. Holds the value for the current date and
 * time.
 * @param timeIn - Of type double. Hold timeStamp for a vehicle's check-in.
 * @param timeOut - Of type double. Hold timeStamp for a vehicle's check-out.
 * @param timeParked - Of type Double. Holds the value for the total time a
 * vehicle has been parked.
 * @param feeSummary - Of type double. Holds the value for total fee parking fee
 * calculation.
 *
 * @author Tyler
 */
public class Receipt implements ReceiptOutputStrategy {

    private int customerNumber;
    private String dateAndTime = "MM/dd/yy hh:mm a z";
    private Date currentDate;
    private double timeIn;
    private double timeOut;
    private double timeParked;
    private double feeSummary;

    /**
     * Empty convenience constructor.
     */
    public Receipt() {
    }

    /**
     * Retrieves the current date and time in proper format.
     *
     * @return - The current, formatted, date & time.
     */
    public String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat(dateAndTime);
        return sdf.format(currentDate);
    }

    /**
     * Sets the date and time on the receipt.
     *
     * @param dateAndTime
     */
    public void setCurrentDate(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
