// Example of Command-Line Arguments
public class CommandLineArgs {
    public static void main(String[] args) {
        // Check if any command-line arguments are passed
        if (args.length > 0) {
            // Print the number of command-line arguments passed
            System.out.println("Number of command-line argument: " + args.length);
        } else {
            // Print a message when no command-line arguments are provided
            System.out.println("No command-line arguments provided.");
        }
    }
}
