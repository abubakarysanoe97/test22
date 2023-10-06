package appdevtest;

public class Boat extends Vehicle{
    private boolean hasGPS;


    public Boat(String name) {
        super(name);
    }

    public Boat(String name, int speed, float price, Engine engine, boolean hasGPS) {
        super(name, speed, price, engine);
        this.hasGPS = hasGPS;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }
    public void printGpsInfo() {
        if (hasGPS) {
            System.out.println("This boat has GPS.");
        } else {
            System.out.println("This boat does not have GPS.");
        }
    }
}
