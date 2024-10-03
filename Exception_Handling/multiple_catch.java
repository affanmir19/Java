public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero!");
        } catch (Exception e) {
            System.out.println("General Exception occurred: " + e.getMessage());
        }
    }
}
