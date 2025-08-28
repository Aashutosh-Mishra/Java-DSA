// No imports needed
// Counter class
class Counter {
static int count = 0; // static variable

// Constructor
Counter() {
    count++;
}

// Method to display count
static void displayCount() {
    System.out.println("Count: " + count);
}
}

// Main class
class staticVar {
public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    // Show static variable using class name
    System.out.println("Counter count: " + Counter.count);
    Counter.displayCount(); // Output: Count: 2
}
}

