
import java.util.*;
// Abstract class
abstract class Animal {
    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }

    // Abstract method (no implementation)
    abstract void sound();
}

// Concrete class that extends the abstract class
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    // Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

class AbstractionClass {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.eat();  // Inherited concrete method
        myDog.sound(); // Overridden method in Dog class

        myCat.eat();  // Inherited concrete method
        myCat.sound(); // Overridden method in Cat class
    }
}


