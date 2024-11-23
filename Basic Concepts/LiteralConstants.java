// Example: Literal Constants in Java
public class LiteralConstants {
    public static void main(String[] args) {
        // Integer Literals
        int decimal = 42; // Decimal (Base 10)
        int binary = 0b101010; // Binary (Base 2) - prefix `0b`
        int octal = 052; // Octal (Base 8) - prefix `0`
        int hex = 0x2A; // Hexadecimal (Base 16) - prefix `0x`

        // Floating-Point Literals
        float pi = 3.14F; // Float literal with 'F' or 'f'
        double largeValue = 1.23e6; // Double in scientific notation

        // Character Literals
        char letter = 'A'; // Single character in single quotes
        char unicode = '\u0041'; // Unicode representation for 'A'

        // String Literals:
        String message = "Hello, Java!";

        // Boolean Literals
        boolean isJavaFun = true;
        boolean isRaining = false;

        // Null Literal
        String nullString = null; // Represents the absence of a value

        // Output all Literals
        System.out.println("\nInteger Literals: ");
        System.out.println("\tDecimal: " + decimal);
        System.out.println("\tBinary: " + binary);
        System.out.println("\tOctal: " + octal);
        System.out.println("\tHexadecimal: " + hex);

        System.out.println("\nFloating-Point Literals:");
        System.out.println("\tFloat Value: " + pi);
        System.out.println("\tDouble in Scientific Notation: " + largeValue);

        System.out.println("\nCharacter Literals:");
        System.out.println("\tCharacter: " + letter);
        System.out.println("\tUnicode Character: " + unicode);

        System.out.println("\nString Literals:");
        System.out.println("\tMessage: " + message);

        System.out.println("\nBoolean Literals:");
        System.out.println("\tIs Java Fun? " + isJavaFun);
        System.out.println("\tIs it Raining? " + isRaining);

        System.out.println("\nNull Literal:");
        System.out.println("\tNull String: " + nullString);
    }
}
