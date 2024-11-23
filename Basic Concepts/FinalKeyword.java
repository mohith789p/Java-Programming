public class FinalKeyword {

    // Final variable: The value of MAX_VALUE cannot be changed once assigned.
    public final int MAX_VALUE = 100;

    // Final method: This method cannot be overridden by subclasses.
    public final void displayMessage() {
        // Printing the value of the final variable MAX_VALUE
        System.out.println("Value of Final Variable is " + MAX_VALUE);
        
        // Indicating that this method cannot be overridden
        System.out.println("This is a final method and cannot be overridden.");
    }

    // Final class: The FinalClass cannot be subclassed because it is final.
    public static final class FinalClass {
        public void printMessage() {
            // Method inside the final class
            System.out.println("This is a method in a final class.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of FinalKeyword
        FinalKeyword obj = new FinalKeyword();

        // Uncommenting the next line will cause a compilation error because MAX_VALUE is final.
        // obj.MAX_VALUE = 200; // Compilation error: cannot assign a value to final variable

        // Calling the final method displayMessage() from the instance obj
        obj.displayMessage();

        // Creating an instance of FinalClass and calling its method printMessage()
        FinalClass fc = new FinalClass();
        fc.printMessage();

        // Trying to subclass a final class will cause a compilation error.
        // Uncommenting the next line will cause a compilation error because FinalClass is final.
        // class SubClass extends FinalClass {} // Compilation error: cannot inherit from final class
    }
}
