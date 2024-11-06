// Superclass'
import java.util.ArrayList;
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

public class thirteenaryan {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog1 = new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();
        Cat cat1 = new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();

        ArrayList<Animal> x=new ArrayList<Animal>();
        x.add(dog1);
        x.add(dog2);
        x.add(dog3);
        x.add(cat1);
        x.add(cat2);
        x.add(cat3);
        for(int i=0;i<x.size();i++){
            x.get(i).sound();
        }
    }
}