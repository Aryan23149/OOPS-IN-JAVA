// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);  // Calls the Exception constructor with the message
    }
}

// Main class
public class fifteengpt {
    public static void main(String[] args) {
        try {
            checkAge(-5);  // Test with an invalid age
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            checkAge(1);
        } catch (InvalidAgeException e) {
            System.out.println("HEHE");
        }
    }

    // Method that throws the custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        } else {
            System.out.println("Valid age: " + age);
        }
    }
}
