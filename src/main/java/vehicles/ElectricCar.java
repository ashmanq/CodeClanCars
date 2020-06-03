package vehicles;

import components.Engine;
import components.Tyres;

public class ElectricCar extends Vehicle{

    private Engine engine;
    private Tyres tyres;

    public ElectricCar(String name, String colour, Double price) {
        super(name, colour, price);
        Engine engine = new Engine("500kW","Tesla V1", "Electric");
        Tyres tyres = new Tyres("Pirelli", "P8", 4);
        this.addComponent(engine);
        this.addComponent(tyres);
    }
}
