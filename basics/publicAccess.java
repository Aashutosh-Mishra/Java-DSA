
public class publicAccess {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Alice"; // Accessible globally
        emp.displayName();  // Accessible globally
    }
}

// Non-public class (package-private)
class Employee {
    public String name; // Public attribute

    public void displayName() { // Public method
        System.out.println("Employee Name: " + name);
    }
}



