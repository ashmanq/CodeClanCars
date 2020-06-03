package components;

public abstract class Component {
    private String type;
    private String make;
    private String name;

    public Component(String type, String make, String name) {
        this.name = name;
        this.type = type;
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }
}

