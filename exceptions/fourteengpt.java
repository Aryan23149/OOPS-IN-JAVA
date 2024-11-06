public class fourteengpt {
    public static void main(String[] args) {
        int[] numbers = {10, 0};
        try {
            int result = numbers[0] / numbers[1];
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

