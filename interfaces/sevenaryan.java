interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car Starts with a Key");
    }
    public void stop(){
        System.out.println("Car Stops with pressing brakes with legs");
    }
}
class Bicycle implements Vehicle{
    public void start(){
        System.out.println("Bicycle Starts with Pedalling");
    }
    public void stop(){
        System.out.println("Bicycle Stops with HandBrakes");
    }
}
public class sevenaryan{
    public static void main(String[] args ){
        Car x1=new Car();
        Bicycle y1=new Bicycle();
        x1.start();
        x1.stop();
        y1.start();
        y1.stop();
    }

}