// Interface
interface Animal {
    void sound();  // Abstract method
}

// Dog class implements Animal interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

// Cat class implements Animal interface
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class sevengpt {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();  // Outputs: The dog barks
        cat.sound();  // Outputs: The cat meows
    }
}

