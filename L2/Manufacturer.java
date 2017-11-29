package L2;

public enum Manufacturer {
    NISSAN,
    VOLVO,
    BMW,
    TOYOTA,
    MERCEDESBENZ("Mercedes Benz");

    private final String manufacturer;

    Manufacturer(){
        this.manufacturer= name();
    }

    Manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
