package tabparkinggaragepos;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *This class will set the guidelines for the information of our receipt of transaction. An output 
 * strategy will be implemented as well. Methods from that interface are declared here and overridden.
 * @author Tyler
 */
public class Receipt {

    //My attempt at being DIP compliant and flexible.
    private ReceiptOutputStrategy printOut;
    //Receipt number variable that prints for every customer who passes through.
    private static int customerNumber = 0;
    //Varialble used to store the output format of the date and time on the 
    //receipt.
    private String dateAndTime = "MM/dd/yy hh:mm a z";
    //Variable on the receipt to hold the value of the current date.
    private Date currentDate;
    //Variable used for gathering "Time Stamp" used in fee calculation.
    private String timeIn;
    private String timeOut;
    //Result of fee calculation.
    private double feeSummary;

    /**
     * Receipt constructor builds a customer printout with: 
     * Receipt Number 
     * Date and Time
     * The Garage Business Name
     * The time parked: To AND From
     * (TimeStamp) Total fee charged for time parked
     *
     * @param recceiptNumber
     * @param dateAndTime - Date and Time printed on the receipt.
     * @param timeIn - Time Stamp.
     * @param timeOut - Time Stamp.
     * @param feeSummary - Final calculation of parking charges.
     */
    public Receipt(String timeIn, String timeOut, ReceiptOutputStrategy printOut) {
        //receiptNumber
        customerNumber++;
        //Creating a date object to display on the receipt
        currentDate = new Date();
        //Time Stamp
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        //Output
        this.printOut = printOut;
        
    }
    
    /**
    * Began work on the output receipt output method. Needs a lot of work.
    */
    public final void printOutReceipt(){
        System.out.println("Thank you for using: ");
    }
    
   /**
     * Makes sure the date and time on receipt are formatted correctly.
     * @param dateAndTime
     * @return formatted receipt date
     */
    public String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat(dateAndTime);
        return sdf.format(currentDate);
    }
    
    /**
     * Method for setting the date and time on the receipt.
     * @param dateAndTime
     */
    public void setCurrentDate(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}


