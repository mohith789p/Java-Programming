public class AssigningObject {

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
        AssigningObject car1 = new AssigningObject();
        car1.make = "Tesla";
        car1.price = 80000;
        // Accessing instance methods and fields using objects
        System.out.println("Car 1 Details:");
        car1.displayCarDetails();
        AssigningObject car2 = car1;
        System.out.println("\nCar 2 Details:");
        car2.price = 60000;
        car2.displayCarDetails();
    }
}
