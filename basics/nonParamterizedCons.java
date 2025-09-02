public class nonParamterizedCons {
    int id;
    String name;

    nonParamterizedCons() {
        id = 10;
        name = "John";
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        nonParamterizedCons obj = new nonParamterizedCons();
        obj.display();
    }
}
