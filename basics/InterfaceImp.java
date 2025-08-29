

import java.util.*;

interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in a kennel.");
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps on a sofa.");
    }
}

public class InterfaceImp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            System.out.println("----------------");
        }
    }
}

