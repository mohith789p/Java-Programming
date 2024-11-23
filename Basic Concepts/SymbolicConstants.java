// Example: Symbolic Constants in Java
public class SymbolicConstants {
    // Defining symbolic constants
    public static final double PI = 3.14159; // Constant for Pi
    public static final int MAX_USERS = 100; // Maximum allowed users
    public static final String APP_NAME = "MyJavaApp"; // Application name

    public static void main(String[] args) {
        System.out.println("Using Symbolic Constants:");
        System.out.println("\tValue of PI: " + PI);
        System.out.println("\tMaximum Users Allowed: " + MAX_USERS);
        System.out.println("\tApplication Name: " + APP_NAME);

        // Using symbolic constants in calculations
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("\tArea of Circle with radius " + radius + ": " + area);

        // Uncommenting the following line will cause an error because constants cannot
        // be modified:
        // PI = 3.14;
        // Error: cannot assign a value to final variable 'PI'
    }
}
