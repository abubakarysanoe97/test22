package appdevtest;

public class Truck extends Vehicle implements Driveable{
    public Truck(String name) {
        super(name);
    }

    public Truck(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType(Vehicle vehicle) {
        super.printVehicleType(vehicle);
    }

    @Override
    public float getPriceAfterTax(Vehicle vehicle) {
        return super.getPriceAfterTax(vehicle);
    }

    @Override
    public void printSpeed(Vehicle vehicle) {

    }
}
