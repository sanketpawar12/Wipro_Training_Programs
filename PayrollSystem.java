package OOPS_Programs;

abstract class Employees {
    String name;
    int empId;

    public Employees(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    
    abstract double calculateSalary();

    
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employees {
    double monthlySalary;

    public FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employees {
    int hoursWorked;
    double ratePerHour;

    public PartTimeEmployee(String name, int empId, int hoursWorked, double ratePerHour) {
        super(name, empId);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

public class PayrollSystem {
	 public static void main(String[] args) {
	        Employees e1 = new FullTimeEmployee("Sanket", 101, 60000);
	        Employees e2 = new PartTimeEmployee("Harsh", 102, 80, 400);

	        e1.display();
	        System.out.println("Salary: ₹" + e1.calculateSalary());

	        System.out.println();
	        e2.display();
	        System.out.println("Salary: ₹" + e2.calculateSalary());
	 }
	 
}
