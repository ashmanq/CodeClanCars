package components;

import components.Component;

public class Tyres extends Component {

    private int noOfTyres;

    public Tyres(String model, String name, int noOfTyres) {
        super("Tyres", model, name);
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }
}
