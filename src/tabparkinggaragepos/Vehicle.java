package tabparkinggaragepos;

import java.util.*;

/**
 *You can't leave a parking garage empty. We need vehicles (Cars, trucks, bikes) to park in it. We'll make 
 * these here. 
 * @author Tyler
 */
public class Vehicle {
    private String make;
    private String model;
    private String plateNumber;

    /*
     * Vehicle class CONSTRUCTOR
     * Make our vehicle(s) here
     * 
     *@param - make
     *@param - model
     *@param - plateNumber
     */
    public Vehicle(String make, String model, String plateNumber) {
        this.make = make;
        this.model = model;
        this.plateNumber = plateNumber;
    }
/*
 * Get and Set make of vehicle
 * @param - make
 */
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    
/*
 * Get and Set model of vehicle
 * @param - model
 */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /*
     * Get and Set plate number of vehicle
     * @param - plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.make);
        hash = 67 * hash + Objects.hashCode(this.model);
        hash = 67 * hash + Objects.hashCode(this.plateNumber);
        return hash;
    }

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
        if (!Objects.equals(this.plateNumber, other.plateNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "make=" + make + ", model=" + model + ", plateNumber=" + plateNumber + '}';
    }
    
    
    
}
