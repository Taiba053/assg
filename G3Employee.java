public class G3Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public G3Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        G3Employee employee = new G3Employee("John Doe", 12345, 50000);
        employee.displayEmployeeDetails();
    }
}

