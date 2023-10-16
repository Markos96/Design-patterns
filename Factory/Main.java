import factory.Factory;
import factory.Vehicle;
import factory.VehicleType;

public class Main {
    
    public static void main(String[] args) {
        
        Factory factory = new Factory();

        Vehicle vehicle1 = factory.createVehicle(VehicleType.CAR);
        vehicle1.start();

        Vehicle vehicle2 = factory.createVehicle(VehicleType.MOTORCYCLE);
        vehicle2.start();

        Vehicle vehicle3 = factory.createVehicle(VehicleType.TRUCK);
        vehicle3.start();
    }
}
