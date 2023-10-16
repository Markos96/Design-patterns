package factory;

public class Factory {

    public Vehicle createVehicle(VehicleType vehicleType) {

        if(vehicleType.equals(VehicleType.CAR)){
            return new Car();
        }else if(vehicleType.equals(VehicleType.TRUCK)){
            return new Truck();
        }else{
            return new Motorcycle();
        }
    } 
}
