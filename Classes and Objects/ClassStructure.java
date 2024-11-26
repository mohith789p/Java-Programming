public class ClassStructure {

    // Fields (Class-Level Variables)
    String courseName = "Object-Oriented Programming";
    String language = "JAVA";

    // Method to display course details
    public void display() {
        System.out.println("Course Details:");
        System.out.println("Course Name: " + courseName+" through "+ language);
    }

    // Main Method
    public static void main(String[] args) {
        // Creating an object of ClassStructure to access non-static members
        ClassStructure course = new ClassStructure();

        // Displaying course details using the object
        course.display();
    }
}
