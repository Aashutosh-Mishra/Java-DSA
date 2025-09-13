import java.util.*;
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
    
    
// Main class
class DynamicProg {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  // Animal reference but Dog object
        
        // Method resolution happens here at runtime based on the object type (Dog)
        myAnimal.sound();  // Calls Dog's sound() method at runtime
    }
}

