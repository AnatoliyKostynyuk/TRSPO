package Lab2;

/**
 * Created by Nick Batist on 10/23/17.
 */
public abstract class AbstractVehicle implements IVehicle {
    protected Manufacturer manufacturer;
    protected String model;
    protected FuelType fuelType;

    public AbstractVehicle() {
    }

    public AbstractVehicle(Manufacturer manufacturer, String model, FuelType fuelType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.fuelType = fuelType;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

 //   @Override
 //   public void fillTank(int fuelAmount, FuelType fuelType){
 //       System.out.println("Tank is filled on "+fuelAmount+" "+fuelType);
 //   }
}
