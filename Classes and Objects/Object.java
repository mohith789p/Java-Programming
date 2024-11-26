public class Object {

    // Fields (Instance Variables)
    String make;
    int price;

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Price: " + price);
    }

    // Main method to create objects and display details
    public static void main(String[] args) {
        // Creating car objects using the constructor
        Object car = new Object();
        car.make = "Tesla";
        car.price = 80000;
        // Accessing instance methods and fields using objects
        System.out.println("Car Details:");
        car.displayCarDetails();
    }
}
