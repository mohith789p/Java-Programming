public class AccessModifiers {

    // Public field: Can be accessed from anywhere
    public String publicField = "I am a public field";

    // Private field: Can only be accessed within the same class
    private String privateField = "I am a private field";

    // Protected field: Can be accessed within the same package or by subclasses
    protected String protectedField = "I am a protected field";

    // Default field: Can only be accessed within the same package
    String defaultField = "I am a default (package-private) field";

    // Public method: Can be accessed from anywhere
    public void displayPublic() {
        System.out.println(publicField);
    }

    // Private method: Can only be accessed within the same class
    private void displayPrivate() {
        System.out.println(privateField);
    }

    // Protected method: Can be accessed within the same package or by subclasses
    protected void displayProtected() {
        System.out.println(protectedField);
    }

    // Default method: Can only be accessed within the same package
    void displayDefault() {
        System.out.println(defaultField);
    }

    // Main method to demonstrate access
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        // Accessing public field and method
        System.out.println("Accessing Public Members:");
        obj.displayPublic(); // Accessible everywhere
        System.out.println(obj.publicField); // Accessible everywhere

        // Accessing protected field and method (can be accessed within the same
        // package)
        System.out.println("\nAccessing Protected Members:");
        obj.displayProtected(); // Accessible in the same package or subclasses
        System.out.println(obj.protectedField); // Accessible in the same package

        // Accessing default (package-private) field and method
        System.out.println("\nAccessing Default Members:");
        obj.displayDefault(); // Accessible within the same package
        System.out.println(obj.defaultField); // Accessible within the same package

        // Accessing private field and method (not accessible outside the class)
        System.out.println("\nAccessing Private Members:");
        obj.displayPrivate(); // Not accessible
        System.out.println(obj.privateField); // Not accessible
    }
}
