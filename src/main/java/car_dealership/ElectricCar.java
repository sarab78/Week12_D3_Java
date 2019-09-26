package car_dealership;

public class ElectricCar extends Car{

    private String engine;
    private String tyres;
    private String color;
    private String wheels;
    private double price;

    public ElectricCar(String Engine, String tyres, String color, String wheels, double price ) {
        this.engine = engine;
        this.tyres = tyres;
        this.color = color;
        this.wheels = wheels;
        this.price = price;

    }

    public String getEngine() {
        return engine;
    }

    public String getTyres() {
        return tyres;
    }

    public String getColor() {
        return color;
    }

    public String getWheels() {
        return wheels;
    }

    public double getPrice() {
        return price;
    }
}
