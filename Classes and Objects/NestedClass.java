// Outer class House
class House {
    // Instance variables of the outer class
    String type;
    int price;

    // Constructor of the outer class
    public House(String type, int price) {
        this.type = type;
        this.price = price;
    }

    // Method of the outer class to display house details
    public void display() {
        System.out.println("House Type: " + type);
        System.out.println("Price: " + price);
    }

    // Nested class Room (Inner Class)
    class Room {
        // Instance variables of the nested (inner) class
        String roomType;
        int roomSize;

        // Constructor of the nested class
        public Room(String roomType, int roomSize) {
            this.roomType = roomType;
            this.roomSize = roomSize;
        }

        // Method of the nested class to display room details
        public void displayRoomDetails() {
            System.out.println("Room Type: " + roomType);
            System.out.println("Room Size: " + roomSize + " sq ft");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        // Creating an instance of the outer class House
        House myHouse = new House("Villa", 2000000);

        // Creating an instance of the nested (inner) class Room using the outer class
        // object
        House.Room myRoom = myHouse.new Room("Living Room", 250);
        myRoom.displayRoomDetails(); // Displaying room details

        // Displaying details of the outer class (House)
        myHouse.display(); // Displaying house details
    }
}
