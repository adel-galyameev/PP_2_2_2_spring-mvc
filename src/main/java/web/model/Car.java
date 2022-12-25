package web.model;

public class Car {

    private String model;

    private  String colour;

    private int number;

    public Car(String model, String colour, int number) {
        this.model = model;
        this.colour = colour;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
