package appdevtest;

public class Car extends Vehicle {
    private int numberOfDoors;
    private float extraTax =.05f;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public float getExtraTax() {
        return extraTax;
    }

    public void setExtraTax(float extraTax) {
        this.extraTax = extraTax;
    }

    public Car(String name) {
        super(name);
    }

    public Car(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }
    public void printNumberOfDoors() {
        System.out.println("Number of Doors: " + numberOfDoors);
    }
    public float getPriceAfterTax() {
        return (getPrice() * (TAX_AMT +extraTax ) ) + getPrice();
    }
}

