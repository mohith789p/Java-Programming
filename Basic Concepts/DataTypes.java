// Data Types in Java
public class DataTypes {
    // Example of Enum
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // 1. Primitive Data Types
        byte byteValue = 127; // 8-bit signed integer
        short shortValue = 32000; // 16-bit signed integer
        int intValue = 2147483647; // 32-bit signed integer
        long longValue = 9223372036854775807L; // 64-bit signed integer

        float floatValue = 3.14f; // 32-bit floating-point
        double doubleValue = 3.141592653589793; // 64-bit floating-point

        char charValue = 'A'; // 16-bit Unicode character
        boolean booleanValue = true; // true or false

        // 2. Non Primitive Data Types
        String stringValue = "Hello, Java!"; // String (class-based)

        // Array Example
        int[] numbers = { 10, 20, 30, 40, 50 }; // Array of integers

        // Enum Example
        Days today = Days.FRIDAY; // Using an enum

        // Output all the values
        System.out.println("Primitive Data Types:"); // Primitive Data Type
        System.out.println("\tByte Value: " + byteValue);
        System.out.println("\tShort Value: " + shortValue);
        System.out.println("\tInt Value: " + intValue);
        System.out.println("\tLong Value: " + longValue);
        System.out.println("\tFloat Value: " + floatValue);
        System.out.println("\tDouble Value: " + doubleValue);
        System.out.println("\tChar Value: " + charValue);
        System.out.println("\tBoolean Value: " + booleanValue);

        System.out.println("\n Non-Primitive Data Types:"); // Non-Primitive Data Types
        System.out.println("\tString Value: " + stringValue);
        System.out.print("\n\tArray:\t");
        System.out.println("First Element: " + numbers[0]);
        System.out.println("\t\tLast Element: " + numbers[numbers.length - 1]);
        System.out.print("\t\tAll Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\tEnum:");
        System.out.println("\t\tToday is: " + today);
        System.out.println("\t\tAll days of the week:");
        for (Days day : Days.values()) {
            System.out.println("\t\t" + day);
        }
    }
}
