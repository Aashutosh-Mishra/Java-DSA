public class copyConstructor {

    int id;
    String name;

    // Parameterized constructor
    copyConstructor(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    copyConstructor(copyConstructor c) {
        id = c.id;
        name = c.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        copyConstructor obj1 = new copyConstructor(30, "Bob");
        copyConstructor obj2 = new copyConstructor(obj1); // Using copy constructor

        obj1.display();
        obj2.display();
    }
}