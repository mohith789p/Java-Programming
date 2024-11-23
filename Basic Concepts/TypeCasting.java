// Example: Type Casting in Java
public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int intValue = 100;
        long longValue = intValue; // int to long
        double doubleValue = intValue; // int to double

        System.out.println("Implicit Casting: ");
        System.out.println("\tInteger value: " + intValue);
        System.out.println("\tLong value: " + longValue);
        System.out.println("\tDouble value: " + doubleValue);

        // Explicit Casting (Narrowing)
        double largeDouble = 99.99;
        int narrowInt = (int) largeDouble; // double to int (fractional part lost)

        long largeLong = 100000L;
        short narrowShort = (short) largeLong; // long to short (possible overflow)

        System.out.println("\n Explicit Casting:");
        System.out.println("\tOriginal Double value: " + largeDouble);
        System.out.println("\tNarrowed Integer value: " + narrowInt);
        System.out.println("\tOriginal Long value: " + largeLong);
        System.out.println("\tNarrowed Short value: " + narrowShort);

        // Casting with Characters
        char charValue = 'A';
        int charToInt = charValue; // char to int (ASCII value)

        int intToChar = 66;
        char intToCharValue = (char) intToChar; // int to char (corresponding Unicode character)

        System.out.println("\nCasting with Characters:");
        System.out.println("\tCharacter value: " + charValue);
        System.out.println("\tCharacter to Integer (ASCII): " + charToInt);
        System.out.println("\tInteger to Character: " + intToCharValue);
    }
}
