public class DevOpsEngineer extends G3Employee {
    private double bonus;

    // Constructor
    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    // Method to calculate total salary (including bonus)
    public double calculateTotalSalary() {
        return getSalary() + bonus;
    }

    //

    // Method to display employee details with total salary
    public void displayEmployeeDetailsWithBonus() {
        displayEmployeeDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary (including bonus): $" + calculateTotalSalary());
    }

    public static void main(String[] args) {
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("Jane Smith", 54321, 60000, 5000);
        devOpsEngineer.displayEmployeeDetailsWithBonus();
    }
}
