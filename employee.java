public class Employee {

    // Instance variables
    int empId;
    String empName;
    String department;
    double salary;

    // Constructor
    Employee(int id, String name, String dept, double salary) {
        this.empId = id;
        this.empName = name;
        this.department = dept;
        this.salary = salary;
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : " + salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee e1 = new Employee(1

