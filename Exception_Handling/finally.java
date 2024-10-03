public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int data = 10 / 0;  // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } finally {
            System.out.println("Finally block always executed.");
        }
    }
}
