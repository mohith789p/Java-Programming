// Example: Scope of Variable Identifiers in Java
public class VariableScope {

    // Global Variable (Class-Level Scope)
    static int globalVar = 50;

    public static void main(String[] args) {
        // Local Variable (Method-Level Scope)
        int localVar = 10;

        System.out.println("Inside Main Method:");
        System.out.println("\tGlobal Variable: " + globalVar); // Accessible everywhere in the class
        System.out.println("\tLocal Variable: " + localVar); // Accessible only in this method

        // Block Scope
        if (localVar < globalVar) {
            int blockVar = 20; // Block-Level Scope
            System.out.println("\tBlock Variable: " + blockVar); // Accessible only within this block
        }

        // Uncommenting the line below would cause an error, as blockVar is out of scope
        // System.out.println("\tBlock Variable Outside Block: " + blockVar);

        demonstrateScope();
    }

    public static void demonstrateScope() {
        // Local Variable in Another Method
        int anotherLocalVar = 30;
        System.out.println("\nInside Another Method:");
        System.out.println("\tGlobal Variable: " + globalVar); // Accessible here as well
        // Uncommenting the line below would cause an error, as localVar is not in scope
        // System.out.println("\tLocal Variable from Main: " + localVar);
        System.out.println("\tAnother Local Variable: " + anotherLocalVar); // Accessible within this method
    }
}
