package Lab2;

/**
 * Created by Nick Batist on 10/23/17.
 */
public class Main {
    public static void main(String[] args) {
        Car nissan = new Car(Manufacturer.NISSAN, "Leaf", FuelType.ELECTRICITY);
        Car volvo = new Car(Manufacturer.VOLVO, "V90", FuelType.EURO);
        Car bmw = new Car(Manufacturer.BMW, "528", FuelType.PREMIUM);
        Car mercedesbenz = new Car(Manufacturer.MERCEDESBENZ, "318i", FuelType.EURO);
        Car toyota = new Car(Manufacturer.TOYOTA, "Prius", FuelType.ELECTRICITY);


        System.out.println("This is electric car :" + bmw );
        System.out.println("This is safe car :" + volvo );
        System.out.println("This is fast car :" + nissan );
        System.out.println("This is Japanese car :" + toyota );
        System.out.println("This is luxury car :" + mercedesbenz );


    }

}
