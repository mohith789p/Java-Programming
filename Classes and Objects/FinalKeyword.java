// Final class - cannot be inherited or extended
final class House {
    // Instance variables of the class
    String type;
    int price;

    // Constructor of the House class
    public House(String type, int price) {
        this.type = type;
        this.price = price;
    }

    // Final method - cannot be overridden in subclasses
    public final void displayDetails() {
        System.out.println("House Type: " + type);
        System.out.println("Price: " + price);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        // Creating an instance of the final class 'House'
        House myHouse = new House("Bungalow", 1000000);

        // Calling the final method
        myHouse.displayDetails(); // Displaying house details
    }
}
