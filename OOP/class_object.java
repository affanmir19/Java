//implementattion of the classs and the object
class Car {
    // Properties
    String color;
    String model;

    // Constructor
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method
    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Red", "Toyota");
        Car car2 = new Car("Blue", "Honda");

        // Accessing object methods
        car1.displayInfo();
        car2.displayInfo();
    }
}
