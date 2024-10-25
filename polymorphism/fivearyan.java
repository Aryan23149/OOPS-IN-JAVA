
// Exercise:
// Create a class called Shape with a method area(), which just prints "Calculating area...".
// Create two subclasses: Circle and Rectangle.
// In Circle, override area() to calculate and print the area of a circle (π * radius^2).
// In Rectangle, override area() to calculate and print the area of a rectangle (length * width).
// In the main() method, create objects of Circle and Rectangle, and call their area() methods to demonstrate method overriding.
class Shape{
    void area(){
        System.out.println("Area: ");
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(){
        this.length=0.0;
        this.breadth=0.0;
    }
    Rectangle(double len,double bre){
        this.length=len;
        this.breadth=bre;
    }
   @Override
    void area(){
        System.out.println("Area of Rectangle is: "+this.length*this.breadth);
    }
}
class Circle extends Shape{
    final  double pie=3.141;
    double radius;
    Circle(){
        this.radius=0.0;
    }
    Circle(double radius){
        this.radius=radius;
    }
    void area(){
        System.out.println("Area of Circle: "+pie*radius*radius);
    }
}
public class fivearyan{
    public static void main(String[] args) {
        Circle c1=new Circle(7.00);
        Rectangle r1=new Rectangle(7.53,3.45);
        c1.area();
        r1.area();
    }
}