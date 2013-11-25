package tabparkinggaragepos;

import java.util.*;

/**
 * Class defines characteristics of a Vehicle object.
 *
 * @param make - Manufacturer vehicle make.
 * @param model - Manufacturer vehicle model.
 * @author Tyler
 */
public class Vehicle {

    private String make;
    private String model;

    /**
     * Empty convenience constructor.
     */
    public Vehicle() {
    }

    /**
     * Retrieves the make of vehicle.
     *
     * @param make - Manufacturer make of vehicle.
     */
    public String getMake() {
        return make;
    }

    /**
     * Retrieves the model of vehicle.
     *
     * @param model - Manufacturer model of vehicle.
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of make.
     *
     * @param make - manufacturer brand name.
     * @throws IllegalArgumentException if make is null or empty.
     */
    public void setMake(String make) throws IllegalArgumentException {
        try {
            if (make == null || make.isEmpty()) {
                System.out.println("Please enter a value for make.");
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Cannot complete. Value is null or empty.");
        }
        this.make = make;
    }

    /**
     * Sets the value of model.
     *
     * @param model - manufacturer model name.
     * @throws IllegalArgumentException if make is null or empty.
     */
    public void setModel(String model) throws IllegalArgumentException {
        try {
            if (make == null || make.isEmpty()) {
                System.out.println("Please enter a value for model.");
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Cannot complete. Value is null or empty.");
        }
        this.model = model;
    }

    /**
     * HashCode based on a combination of make and model.
     *
     * @return the HashCode
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.make);
        hash = 67 * hash + Objects.hashCode(this.model);
        return hash;
    }

    /**
     * Equality is based on a combination of make and model.
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
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.make, other.make)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
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
        return "Vehicle{" + "make=" + make + ", model=" + model + '}';
    }
}
