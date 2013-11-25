package tabparkinggaragepos;

import java.util.Objects;

/**
 * Class defines the identifying characteristics that will change/be different
 * from garage to garage.
 *
 * @param Vehicle vehicle - Component.
 * @param garageName - A String Value.
 * @param garageAddress - A String Value.
 * @param garagePhoneNumber - A String Value.
 * @author Tyler
 */
public class ParkingGarage implements ParkingGarageStrategy {

    /**
     * Vehicle component.
     */
    Vehicle vehicle;
    
    /**
     * Garage Fee calculator objects.
     *
     * @param bvgfc - Best Value garage fee calculator object
     * @param tgfc - Thrifty garage fee calculator object
     */
    BestValueGarageFeeCalculator bvgfc = new BestValueGarageFeeCalculator();
    ThriftyGarageFeeCalculator tgfc = new ThriftyGarageFeeCalculator();
    /**
     * Private fields.
     */
    private String garageName;
    private String garageAddress;
    private String garagePhoneNumber;

    /**
     * Empty constructor to allow the instantiation of a parking garage object.
     */
    public ParkingGarage() {
    }

    /**
     * Retrieve the values of a garages identifying characteristics.
     *
     * @param garageName - A String value.
     * @return - a garage name.
     */
    @Override
    public String getGarageName() {
        return garagePhoneNumber;
    }

    /**
     * Retrieves the garage Address.
     *
     * @param garageAddress - A String value.
     * @return - a garage address.
     */
    @Override
    public String getGarageAddress() {
        return garageAddress;
    }

    /**
     * Retrieves the garage phone number.
     *
     * @param garagePhoneNumber - A string value.
     * @return - a garage phone number.
     */
    @Override
    public String getGaragePhoneNumber() {
        return garagePhoneNumber;
    }

    /**
     * Set the value for a garages name.
     *
     * @param garageName - A String value.
     * @throws IllegalArgumentException
     */
    @Override
    public void setGarageName(String garageName) throws IllegalArgumentException {
        try {
            if (garageName == null || garageName.isEmpty()) {
                System.out.println("Please enter a valid garage name.");
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Value is null or has not been entered.");
        }
        this.garageName = garageName;
    }

    /**
     * Sets the value for a garages address.
     *
     * @param garageAddress - A String value.
     * @throws IllegalArgumentException
     */
    @Override
    public void setGarageAddress(String garageAddress) throws IllegalArgumentException {
        try {
            if (garageAddress == null || garageAddress.isEmpty()) {
                System.out.println("Please enter a valid garage address.");
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Value is null or has not been entered.");
        }
        this.garageAddress = garageAddress;
    }

    /**
     * Sets the value for a garages phone number.
     *
     * @param garagePhoneNumber
     * @throws IllegalArgumentException
     */
    @Override
    public void setGaragePhoneNumber(String garagePhoneNumber) throws IllegalArgumentException {
        try {
            if (garagePhoneNumber == null || garagePhoneNumber.isEmpty()) {
                System.out.println("Please enter a valid garage phone number.");
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Value is null or has not been entered.");
        }
        this.garagePhoneNumber = garagePhoneNumber;
    }

    /**
     * HashCode is based on a combination of a garage name, address, and phone
     * number.
     *
     * @return - the HashCode
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.garageName);
        hash = 13 * hash + Objects.hashCode(this.garageAddress);
        hash = 13 * hash + Objects.hashCode(this.garagePhoneNumber);
        return hash;
    }

    /**
     * Equality is based on a combination of a garage name, address, and phone
     * number.
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
        final ParkingGarage other = (ParkingGarage) obj;
        if (!Objects.equals(this.garageName, other.garageName)) {
            return false;
        }
        if (!Objects.equals(this.garageAddress, other.garageAddress)) {
            return false;
        }
        if (!Objects.equals(this.garagePhoneNumber, other.garagePhoneNumber)) {
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
        return "ParkingGarage{" + "garageName=" + garageName + ", garageAddress=" + garageAddress + ", garagePhoneNumber=" + garagePhoneNumber + '}';
    }
}
