package OOPS_Programs;

class Employee {
    private String name;
    private double salary;

    
    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Sanket");
        emp.setSalary(60000);
        emp.display();
    }
}

