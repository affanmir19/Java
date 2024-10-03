public class BasicMethodExample {

    // Method that adds two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = addNumbers(10, 20);  // Call the method with two arguments
        System.out.println("The sum is: " + result);  // Output: The sum is: 30
    }
}
