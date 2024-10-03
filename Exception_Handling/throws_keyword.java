// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ThrowsKeywordExample {

    // Method that checks age and can throw an InvalidAgeException
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        System.out.println("Access granted. Age: " + age);
    }

    public static void main(String[] args) {
        ThrowsKeywordExample example = new ThrowsKeywordExample();
        
        try {
            example.checkAge(15); // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        // Checking a valid age
        try {
            example.checkAge(20); // This will not throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
