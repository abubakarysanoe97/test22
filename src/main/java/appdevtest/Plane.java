package appdevtest;

public class Plane extends Vehicle implements Flyable {
    public Plane(String name) {
        super(name);
    }

    public Plane(String name, int speed, float price, Engine engine) {
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
    public boolean transportsPassengers() {
        return false;
    }
}
