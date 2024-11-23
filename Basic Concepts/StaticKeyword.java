public class StaticKeyword {

    // Static variable
    public static int counter = 0;

    // Static block 1: Used for static initialization
    static {
        System.out.println("Static Block 1: Initializing static variables...");
        counter = 10; // Initializing static variable
    }

    // Static block 2: Used for further static initialization
    static {
        System.out.println("Static Block 2: Modifying static variable...");
        counter += 5; // Incrementing static variable
    }

    // Static method
    public static void displayCounter() {
        System.out.println("Counter value in static method: " + counter);
    }

    public static void main(String[] args) {
        // Accessing static method
        StaticKeyword.displayCounter(); // Output: Counter value in static method: 15
    }
}
