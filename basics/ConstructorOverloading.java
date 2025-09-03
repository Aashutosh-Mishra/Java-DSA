// Java Program to demonstrate Constructor Overloading
import java.util.*;
class Employee {
        public String employeeName; // To store the name of the employee
        public int salary;          // To store the salary of the employee
    
        // Default Constructor
        public Employee() {
            this.employeeName = "Unknown";
            this.salary = 0;
        }
    
        // Constructor with one parameter
        public Employee(String employeeName) {
            this.employeeName = employeeName;
            this.salary = 0; // Default salary
        }
    
        // Constructor with two parameters
        public Employee(String employeeName, int salary) {
            this.employeeName = employeeName;
            this.salary = salary;
        }
    
        // Method to display employee details
        public void displayDetails() {
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Salary: " + salary);
        }
    }
    
    // Main Class
    class ConstructorOverloading {
        public static void main(String[] args) {
            // Using Default Constructor
            Employee emp1 = new Employee();
            System.out.println("Details of Employee 1 (Default Constructor):");
            emp1.displayDetails();
    
            System.out.println(); // Line break for clarity
    
            // Using Constructor with one parameter
            Employee emp2 = new Employee("Raj");
            System.out.println("Details of Employee 2 (One Parameter Constructor):");
            emp2.displayDetails();
    
            System.out.println(); // Line break for clarity
    
            // Using Constructor with two parameters
            Employee emp3 = new Employee("Rahul", 5000);
            System.out.println("Details of Employee 3 (Two Parameters Constructor):");
            emp3.displayDetails();
        }
    }

