package TruckDocking;

public abstract class Vehicle {
    protected int weight;

    public Vehicle(int weight) {
        this.weight = weight;
    }

    public abstract String toString();
}
