
// Example of User Input using Scanner
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read the input as a string

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read the input as an integer

        // Display a greeting message with the entered name and age
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close(); // Close the Scanner to free resources
    }
}
