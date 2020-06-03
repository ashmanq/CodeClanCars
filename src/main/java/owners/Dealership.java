package owners;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private String name;
    private Double till;

    public Dealership(String name) {
        this.stock = new ArrayList<Vehicle>();
        this.name = name;
        this.till = 0.00;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Double getTill() {
        return till;
    }

    public void addVehicle(Vehicle vehicle) {
        this.stock.add(vehicle);
    }
}
