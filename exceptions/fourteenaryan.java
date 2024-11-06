import java.util.Scanner;
public class fourteenaryan {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input=new Scanner(System.in);

        num1=input.nextInt();
        input.nextLine();

        num2=input.nextInt();
        input.nextLine();

        try {
            int result=num1/num2;
            System.out.println("RESULT: "+result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        }
        finally{
            System.out.println("THIS CONCLUDES THE CALCULATION!");
            input.close();
        }
    }
}

// Exercise
// Write a Java program that:

// Prompts the user to input two numbers.
// Attempts to divide the first number by the second and prints the result.
// Catches and handles ArithmeticException (e.g., division by zero).
// Contains a finally block that prints a message indicating the end of the program, 
// regardless of whether an exception occurred.