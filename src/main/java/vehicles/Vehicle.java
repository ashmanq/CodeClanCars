package vehicles;

import components.Component;

import java.util.ArrayList;

public abstract class Vehicle {

    private String name;
    private String colour;
    private Double price;
    private ArrayList<Component> components;

    public Vehicle(String name, String colour, Double price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.components = new ArrayList<Component>();
    }

    public String getName() {
        return this.name;
    }

    public String getColour() {
        return this.colour;
    }

    public Double getPrice() {
        return this.price;
    }

    public ArrayList<Component> getComponents() {
        return this.components;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }
}
