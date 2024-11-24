public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;

        // Basic assignment
        System.out.println("Initial value of a: " + a);

        // Add and assign
        a += 5; // => a = a + 5
        System.out.println(" a += 5: " + a);

        // Subtract and assign
        a -= 3; // => a = a - 3
        System.out.println(" a -= 3: " + a);

        // Multiply and assign
        a *= 2; // => a = a * 2
        System.out.println(" a *= 2: " + a);

        // Divide and assign
        a /= 4; // => a = a / 4
        System.out.println(" a /= 4: " + a);

        // Modulo and assign
        a %= 5; // => a = a % 5
        System.out.println(" a %= 5: " + a);

        a = 10; // Resetting a

        // Bitwise AND and assign
        a &= 7; // => a = a & 7
        System.out.println(" a &= 7: " + a);

        // Bitwise OR and assign
        a |= 5; // => a = a | 5
        System.out.println(" a |= 5: " + a);

        // Bitwise XOR and assign
        a ^= 3; // => a = a ^ 3
        System.out.println(" a ^= 3: " + a);

        // Left shift and assign
        a <<= 2; // => a = a << 2
        System.out.println(" a <<= 2: " + a);

        // Right shift and assign
        a >>= 2; // => a = a >> 2
        System.out.println(" a >>= 2: " + a);

        // Unsigned right shift and assign
        a >>>= 1; // => a = a >>> 1
        System.out.println(" a >>>= 1: " + a);
    }
}
