abstract class Appliance{
    abstract void turnOn();
    void showStatus(){
        System.out.println("Appliance is off");
    }
}
class fan extends Appliance{
    void turnOn(){
        System.out.println("Fan is Spinning");
    }
}
class light extends Appliance{
    void turnOn(){
        System.out.println("Light is illuminating its surrounding");
    }
}
public class sixaryan {
    public static void main(String[] args) {

        light bulb1=new light();
        fan fan1=new fan();

        bulb1.turnOn();
        bulb1.showStatus();

        fan1.turnOn();
        fan1.showStatus();
    }
}
// Create an abstract class Appliance with:
// An abstract method turnOn().
// A concrete method showStatus() that prints "Appliance is off".
// Create two concrete subclasses: Fan and Light.
// In Fan, override turnOn() to print "Fan is spinning".
// In Light, override turnOn() to print "Light is on".
// In the main() method, create objects of Fan and Light, and call their turnOn() and showStatus() methods.