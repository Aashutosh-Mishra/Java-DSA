public class ParametrizedConst {
    int id;
    String name;

    ParametrizedConst(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        ParametrizedConst obj = new ParametrizedConst(20, "Alice");
        obj.display();
    }
}
