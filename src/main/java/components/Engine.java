package components;

import components.Component;

public class Engine extends Component {

    private String fuelType;

    public Engine(String model, String name, String fuelType) {
        super("Engine", model, name);
        this.fuelType = fuelType;
    }


    public String getFuelType() {
        return fuelType;
    }
}
