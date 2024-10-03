public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            try {
                int result = 10 / 0;  // This will throw ArithmeticException
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Arithmetic Exception");
            }
            System.out.println(numbers[5]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Array index is out of bounds!");
        }
    }
}
