import java.util.*;

// Interface with a default method
interface Example {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

// Class implementing the interface
class Demo implements Example {
    // You can add other methods here if needed
    public void show() {
        System.out.println("This is a method inside Demo class.");
    }

    public static void main(String[] args) {
        Example obj = new Demo();   // Reference of interface, object of Demo
        obj.defaultMethod();        // Accessing default method from interface

        Demo demoObj = new Demo();
        demoObj.show();             // Accessing class-specific method
    }
}

// Another class with its own main (Optional)
public class DefaultInterface {
    public static void main(String[] args) {
        Example obj = new Demo();
        obj.defaultMethod();   // Accessing default method again
    }
}
