// Create a class called MathOperations.
// Add three multiply() methods:
// One that takes two integers.
// One that takes three integers.
// One that takes two doubles.
// In the main() method, call each multiply() method and print the result.
public class fouraryan{
    public static void main(String[] args) {
        MathOperations x=new MathOperations();
        System.out.println(x.multiply(4,6));
        System.out.println(x.multiply(4,4,6));
        System.out.println(x.multiply(4.667,66));
    }
    static class MathOperations{
        int multiply(int a,int b){
            return a*b;
        }
        int multiply(int a,int b,int c){
            return a*b*c;
        }
        double multiply(double a,double b){
            return a*b;
        }
    }
}
// class MathOperations{
//     int multiply(int a,int b){
//         return a*b;
//     }
//     int multiply(int a,int b,int c){
//         return a*b*c;
//     }
//     double multiply(double a,double b){
//         return a*b;
//     }
// }