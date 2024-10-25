//If a class contains at least one abstract method, the class must be declared abstract.
//A subclass of an abstract class must either implement all abstract methods or be declared abstract itself.
abstract class Vehicle {
    abstract void start(); // Abstract method

    void fuel() { // Non-abstract method
        System.out.println("Filling fuel...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The car starts with a key");
    }
}

class ElectricCar extends Vehicle {
    @Override
    void start() {
        System.out.println("The electric car starts with a button");
    }
}

public class sixgpt {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.fuel();

        ElectricCar eCar = new ElectricCar();
        eCar.start();
        eCar.fuel();
    }
}
