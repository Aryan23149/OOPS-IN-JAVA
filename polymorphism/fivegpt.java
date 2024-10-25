// Superclass
class Animal {
    void sound() {
        System.out.println("This animal makes a sound");
    }
}

// Subclass that overrides the method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

// Another subclass
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows");
    }
}

public class fivegpt {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.sound();  // Calls method in Animal
        dog.sound();     // Calls overridden method in Dog
        cat.sound();     // Calls overridden method in Cat
    }
}
