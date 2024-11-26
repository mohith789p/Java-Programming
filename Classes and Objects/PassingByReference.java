class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }
}

public class PassingByReference {
    // Method to demonstrate pass-by-reference with objects
    public static void updateCarModel(Car car) {
        car.model = "Tesla"; // Changing the object’s attribute inside the method
        System.out.println("Car model inside method: " + car.model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("BMW");
        System.out.println("Original car model before method: " + myCar.model);
        updateCarModel(myCar); // Passing the object
        System.out.println("Car model after method: " + myCar.model); // The original object is modified
    }
}
