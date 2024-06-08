// Define an abstract class 'Employee' to represent common attributes and behaviors
abstract class Employee {
    private static int nextEmployeeID = 1;  // Static variable to generate unique IDs
    protected int employeeID;
    protected String designation;

    // Constructor to initialize common attributes
    public Employee(String designation) {
        this.employeeID = nextEmployeeID++;
        this.designation = designation;
    }

    // Abstract method for displaying employee information
    public abstract void displayInfo();

    // Common method for availing transport facility
    public void availTransport() {
        System.out.println("Employee " + employeeID + " is availing transport facility.");
    }
}

// FullTimeEmployee class extending Employee
class FullTimeEmployee extends Employee {
    private static final int LEAVE_DAYS = 15;
    private static final double BASE_SALARY = 50000;
    private static final double ALLOWANCE_PERCENTAGE = 0.20;

    // Constructor to initialize full-time employee attributes
    public FullTimeEmployee() {
        super("Full-Time");
    }

    // Overridden method to display full-time employee information
    @Override
    public void displayInfo() {
        System.out.println("Full-Time Employee Information:");
        System.out.println("ID: " + employeeID);
        System.out.println("Designation: " + designation);
        System.out.println("Leave Days: " + LEAVE_DAYS);
        System.out.println("Base Salary: " + BASE_SALARY);
        System.out.println("Allowance: " + (BASE_SALARY * ALLOWANCE_PERCENTAGE));
    }
}

// PartTimeEmployee class extending Employee
class PartTimeEmployee extends Employee {
    private static final int LEAVE_DAYS = 7;
    private static final double BASE_SALARY = 35000;
    private static final double ALLOWANCE_PERCENTAGE = 0.08;

    // Constructor to initialize part-time employee attributes
    public PartTimeEmployee() {
        super("Part-Time");
    }

    // Overridden method to display part-time employee information
    @Override
    public void displayInfo() {
        System.out.println("Part-Time Employee Information:");
        System.out.println("ID: " + employeeID);
        System.out.println("Designation: " + designation);
        System.out.println("Leave Days: " + LEAVE_DAYS);
        System.out.println("Base Salary: " + BASE_SALARY);
        System.out.println("Allowance: " + (BASE_SALARY * ALLOWANCE_PERCENTAGE));
    }
}

// Contractor class extending Employee
class Contractor extends Employee {
    private static final double FIXED_AMOUNT = 70000;

    // Constructor to initialize contractor attributes
    public Contractor() {
        super("Contractor");
    }

    // Overridden method to display contractor information
    @Override
    public void displayInfo() {
        System.out.println("Contractor Information:");
        System.out.println("ID: " + employeeID);
        System.out.println("Designation: " + designation);
        System.out.println("Fixed Amount: " + FIXED_AMOUNT);
        System.out.println("No leave days");
    }
}

// Main class
public class Quiz1{
    public static void main(String[] args) {
        // Create instances of different employee types
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        Contractor contractor = new Contractor();

        // Display information for each employee type
        fullTimeEmployee.displayInfo();
        System.out.println();
        partTimeEmployee.displayInfo();
        System.out.println();
        contractor.displayInfo();

        // Avail transport facility for a full-time employee
        fullTimeEmployee.availTransport();
    }
}
 
