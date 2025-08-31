import java.util.*;


class Employee {
    private int salary;          // to store the salary of employee
    private String employeeName; // to store the name of employee
    
    // Method to set the employee name as given input
    public void setName(String s) {
        employeeName = s;
    }
    
    // Method to set the salary as given input
    public void setSalary(int val) {
        salary = val;
    }
    
    // Method to get the salary of the employee
    public int getSalary() {
        return salary;
    }

    // Method to get the employee name
    public String getName() {
        return employeeName;
    }
}

public class class_obj {
    public static void main(String[] args) {
        // Creating an object of Employee class
        Employee obj1 = new Employee();
        
        // Setting different attributes of object 1 using available methods
        obj1.setName("Raj"); 
        obj1.setSalary(10000);
        
        // Creating another object of Employee class
        Employee obj2 = new Employee();
        
        obj2.setName("Rahul"); 
        obj2.setSalary(15000);
        
        // Accessing the attributes of different objects
        System.out.println("Salary of " + obj1.getName() + " is " + obj1.getSalary());
        System.out.println("Salary of " + obj2.getName() + " is " + obj2.getSalary());
    }
}
