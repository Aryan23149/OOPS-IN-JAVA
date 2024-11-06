interface Appliance{
    void turnOn();
    void turnOff();
}
interface SmartAppliance extends Appliance{
    void connectToWiFi();
}
class SmartLight implements  SmartAppliance{
    @Override
    public void turnOn(){
        System.out.println("HERE ENDS DARKNESS");
    }
    @Override
    public void turnOff(){
        System.out.println("HERE STARTS LIGHT'S DOWNFALL");
    }
    @Override
    public void connectToWiFi(){
        System.out.println("WIFI CONNECTED ");
    }
}
public class eightaryan {
    public static void main(String[] args) {
        SmartLight num1=new SmartLight();
        num1.turnOff();
        num1.turnOn();
        num1.connectToWiFi();
    }
}
// Create an interface called Appliance with methods:
// void turnOn()
// void turnOff()
// Create another interface called SmartAppliance that extends Appliance and adds the method:
// void connectToWiFi()
// Create a class SmartLight that implements SmartAppliance:
// Implement turnOn(), turnOff(), and connectToWiFi() methods with appropriate print statements.
// In the main() method, create an object of SmartLight and call all three methods to demonstrate the functionality.
