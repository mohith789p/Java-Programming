public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;

        // Pre-increment: Increment the value by 1, then use it.
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Value after Pre-increment: " + a);

        // Post-increment: Use the current value, then increment by 1.
        System.out.println("Post-increment: " + (a++));
        System.out.println("Value after post-increment: " + a);

        // Pre-decrement: Decrement the value by 1, then use it.
        System.out.println("Pre-decrement: " + (--a));
        System.out.println("Value after Pre-decrement: " + a);

        // Post-decrement: Use the current value, then decrement by 1.
        System.out.println("Post-decrement: " + (a--));
        System.out.println("Value after post-decrement: " + a);
    }
}
