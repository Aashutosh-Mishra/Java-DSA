import java.util.*;
class Example {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class staticInterface {
    public static void main(String[] args) {
        Example.staticMethod();  // Accessing static method directly using the class name
    }
}

