package vehicles;


import components.Engine;
import components.Tyres;

public class Car extends Vehicle {


    public Car(String name, String colour, Double price) {
        super(name, colour, price);
        Engine engine = new Engine("1.8l","Ford V8", "Petrol");
        Tyres tyres = new Tyres("Bridgeton", "B10", 4);
        this.addComponent(engine);
        this.addComponent(tyres);

    }

}
