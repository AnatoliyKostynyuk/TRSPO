package Lab2;

/**
 * Created by Nick Batist on 10/23/17.
 */
public class Car extends AbstractVehicle {

    public Car() { super(); }
    public Car(Manufacturer manufacturer, String model, FuelType fuelType) {
        super(manufacturer, model, fuelType); }


    @Override
    public String toString() {
        return manufacturer +" "+ model + " "+fuelType;
    }
}


