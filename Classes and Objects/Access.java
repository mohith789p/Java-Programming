class Home {
    // Public, private, and protected fields
    public String housetype; // Can be accessed directly
    private int amount; // Can only be accessed within this class
    protected String address; // Can be accessed within the same package or subclasses

    // Constructor to initialize the home object
    public Home(String housetype, int amount, String address) {
        this.housetype = housetype;
        this.amount = amount;
        this.address = address;
    }

    // Method to display the details of the house
    public void details() {
        System.out.println("House type: " + housetype);
        System.out.println("Price: " + amount); // Private field can be accessed within the class
        System.out.println("Address: " + address);
    }

    // Method to update the amount of the house (private field is modified)
    public void updateAmount(int newAmount) {
        this.amount = newAmount; // Changes the value of the private field
        System.out.println("Amount updated to: " + this.amount);
    }

    // Method to update the address of the house (protected field can be modified)
    public void updateAddress(String newAddress) {
        this.address = newAddress; // Protected field can be updated here
        System.out.println("Address updated to: " + this.address);
    }

    // Method to update the house type (public field can be directly modified)
    public void updateHouseType(String newType) {
        this.housetype = newType; // Public field can be updated directly
        System.out.println("House Type updated to: " + this.housetype);
    }
}

public class Access {
    public static void main(String[] args) {
        // Creating a Home object and initializing it
        Home myHouse = new Home("Duplex", 1500000, "Hyderabad");
        myHouse.details(); // Displaying initial house details

        // Directly updating the public field 'housetype'
        myHouse.housetype = "PentHouse";
        System.out.println("After updating housetype:");
        myHouse.details();

        // Directly updating the protected field 'address'
        myHouse.address = "Bengaluru";
        System.out.println("After updating Address:");
        myHouse.details();

        // Cannot access the private 'amount' field directly
        // myHouse.amount = 75000; // This line will cause a compile-time error

        // Use the public method to update the private 'amount' field
        myHouse.updateAmount(75000); // Using the method to update private field
        System.out.println("After updating Price:");
        myHouse.details();
    }
}
