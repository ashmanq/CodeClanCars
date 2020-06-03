package owners;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private Double money;
    private ArrayList<Vehicle> vehicles;
    private String name;

    public Customer(String name, Double money) {
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public String getName() {
        return name;
    }

    public boolean checkHasEnoughMoney(double amount) {
        if(this.money >= amount) {
            return true;
        }
        return false;
    }

    public void buyVehicle(Vehicle vehicle) {
        if(checkHasEnoughMoney(vehicle.getPrice())) {
            this.vehicles.add(vehicle);
            this.money -= vehicle.getPrice();
        }

    }
}
