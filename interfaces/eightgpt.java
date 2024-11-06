// 5. Inheritance with Interfaces
// In Java, interfaces can extend other interfaces, allowing you to create a more complex hierarchy of interfaces. When an interface extends another interface, it inherits all the abstract methods from the parent interface, and any class implementing the child interface must provide implementations for all inherited methods.

// Key Features:
// Multiple Inheritance: An interface can extend multiple interfaces, allowing a class to implement multiple interfaces at once.
// Abstract Methods: All abstract methods in the parent interface must be implemented in the implementing class.

interface Vehicle {
    void start();
    void stop();
}

// Extended interface
interface ElectricVehicle extends Vehicle {
    void charge();  // Additional abstract method
}

class ElectricCar implements ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Electric Car Starts silently");
    }

    @Override
    public void stop() {
        System.out.println("Electric Car Stops smoothly");
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging");
    }
}
public class eightgpt{
    public static void main(String[] args) {
        ElectricCar mycar=new ElectricCar();
        mycar.start();
        mycar.stop();
        mycar.charge();
    }
}

