// Example: Formatted Output with printf() Method
public class FormattedOutput {
    public static void main(String[] args) {
        // Basic printf usage
        System.out.printf("Hello, %s!%n", "Java"); // %s for strings, %n for newline

        // Integer formatting
        int number = 42;
        System.out.printf("Integer: %d%n", number); // %d for integers
        System.out.printf("Padded Integer (5 spaces): %5d%n", number); // Width of 5
        System.out.printf("Left-Aligned Integer: %-5d%n", number); // Left-aligned

        // Floating-point formatting
        double pi = 3.14159;
        System.out.printf("Double: %.2f%n", pi); // %.2f for 2 decimal places
        System.out.printf("Padded Double: %10.3f%n", pi); // Width of 10, 3 decimals

        // Multiple values
        String name = "Alice";
        int age = 25;
        double salary = 50000.75;
        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);

        // Boolean and Character formatting
        boolean isJavaFun = true;
        char grade = 'A';
        System.out.printf("Boolean: %b, Grade: %c%n", isJavaFun, grade);

        // Hexadecimal and Octal formatting
        int hexNum = 255;
        System.out.printf("Hexadecimal: %x%n", hexNum); // %x for lowercase hex
        System.out.printf("Hexadecimal (Uppercase): %X%n", hexNum); // %X for uppercase hex
        System.out.printf("Octal: %o%n", hexNum); // %o for octal

        // Aligning columns
        System.out.println("Table Format:");
        System.out.printf("%-10s %-10s %-10s%n", "Name", "Age", "Salary"); // Column headers
        System.out.printf("%-10s %-10d %-10.2f%n", "Bob", 30, 45000.50);
        System.out.printf("%-10s %-10d %-10.2f%n", "Carol", 28, 52000.00);
    }
}
