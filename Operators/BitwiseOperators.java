public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        // Display binary representation of a and b
        System.out.println("Binary of a (5): " + Integer.toBinaryString(a));
        System.out.println("Binary of b (3): " + Integer.toBinaryString(b));

        // Bitwise AND: Performs AND operation on each bit
        System.out.println("Bitwise AND (a & b): " + (a & b) + " [binary: " + Integer.toBinaryString(a & b) + "]");

        // Bitwise OR: Performs OR operation on each bit
        System.out.println("Bitwise OR (a | b): " + (a | b) + " [binary: " + Integer.toBinaryString(a | b) + "]");

        // Bitwise XOR: Performs XOR operation on each bit
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b) + " [binary: " + Integer.toBinaryString(a ^ b) + "]");

        // Bitwise Left Shift: Shifts bits to the left by 1 position
        System.out.println(
                "Bitwise Left Shift (a << 1): " + (a << 1) + " [binary: " + Integer.toBinaryString(a << 1) + "]");

        // Bitwise Right Shift: Shifts bits to the right by 1 position
        System.out.println(
                "Bitwise Right Shift (a >> 1): " + (a >> 1) + " [binary: " + Integer.toBinaryString(a >> 1) + "]");

        // Bitwise Unsigned Right Shift: Shifts bits to the right by 1 position, filling
        // with 0
        System.out.println("Bitwise Unsigned Right Shift (a >>> 1): " + (a >>> 1) + " [binary: "
                + Integer.toBinaryString(a >>> 1) + "]");
    }
}
