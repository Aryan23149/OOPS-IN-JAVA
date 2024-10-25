
// Parent class
class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    
    Dog(String name) {
        super(name); // Calling the parent class constructor
    }
    
    @Override
    void sound() {
        System.out.println(name + " barks.");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    
    Cat(String name) {
        super(name); // Calling the parent class constructor
    }
    
    @Override
    void sound() {
        System.out.println(name + " meows.");
    }
}

public class threegpt {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        
        dog.sound();  // Output: Buddy barks.
        cat.sound();  // Output: Whiskers meows.
    }
}
