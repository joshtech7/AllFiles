

public class Car {

    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        Car myCar1 = new Car("Toyota", "Oct 16 1904", 1_000_000_000.00);
        Car myCar2 = new Car("Mercedes", "January 10 1680", 2_000_000_000);

        // Accessing and printing car information
        System.out.println("Car 1: " + myCar1.getModel() + ", " + myCar1.getYear() + ", $" + myCar1.getPrice());
        System.out.println("Car 2: " + myCar2.getModel() + ", " + myCar2.getYear() + ", $" + myCar2.getPrice());
    }
}
