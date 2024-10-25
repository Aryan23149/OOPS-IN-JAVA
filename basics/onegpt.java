// Defining a class named 'Car'
class Car {
    // Attributes of the class
    String model;
    String color;
    int year;
    
    // Constructor to initialize the object
    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    
    // Method to display car details
    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// Main class to create objects and use methods
public class onegpt {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car car1 = new Car("Toyota Corolla", "Red", 2020);
        
        // Using the object's method
        car1.displayInfo();
    }
}
