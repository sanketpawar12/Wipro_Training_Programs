package day4;

public class CompanyProgram {
	class Department{
		private String name;
		private double sales;
		private double expenses;
		
		public Department(String name, double sales, double expenses) {
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
		}
		
		public double getProfit() {
			return sales - expenses;
		}
		
		public void displayDeptDetails() {
			System.out.println("Sales: $"+ sales);
			System.out.println("Expenses: $"+ expenses);
			System.out.println("Profit: $"+ getProfit());
		}
	}
class Company{
	private Department[] departments;
	private int departmentCount;
	
	
	public Company(int maxDepartments) {
		departments = new Department[maxDepartments];
		departmentCount = 0;
	}
	
	public void addDepartment(Department department) {
		if(departmentCount < departments.length) {
			departments[departmentCount] = department;
			departmentCount++;
		}else {
			System.out.println("Cannot add more departments");
		}
	}
	
	public double getTotalProfit() {
		double totalProfit = 0;
		for(int i = 0; i < departmentCount; i++) {
			totalProfit += departments[i].getProfit();
		}
		return totalProfit;
	}
	
	public void displayAllDepartments() {
		System.out.println("Company Departments and Their Profits");
		for(int i = 0; i < departmentCount; i++) {
			departments[i].displayDeptDetails();
		}
	}
}
	public static void main(String[] args) {
		CompanyProgram companyprogram = new CompanyProgram();
		
		Company company = companyprogram.new Company(3);
		
		   Department salesDepartment = companyprogram.new Department("Sales", 500000, 200000);
	       Department hrDepartment = companyprogram.new Department("Human Resources", 200000, 150000);
	       Department itDepartment = companyprogram.new Department("IT", 350000, 100000);
	       company.addDepartment(salesDepartment);
	       company.addDepartment(hrDepartment);
	       company.addDepartment(itDepartment);
	       company.displayAllDepartments();
	}
}
