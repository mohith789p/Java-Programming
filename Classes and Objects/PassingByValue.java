public class PassingByValue {
    // Method to demonstrate pass-by-value with primitive data type
    public static void updateValue(int num) {
        num = 20; // Changing the value inside the method
        System.out.println("Value inside method: " + num);
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Original value before method: " + number);
        updateValue(number); // Passing the value
        System.out.println("Value after method: " + number); // The original value remains unchanged
    }
}
