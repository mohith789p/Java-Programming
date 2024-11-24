public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Ternary operation to find the maximum value
        int max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max);

        // Ternary operation to find the minimum value
        int min = (a < b) ? a : b;
        System.out.println("The minimum value is: " + min);
    }
}
