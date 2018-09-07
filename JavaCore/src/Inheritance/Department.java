package Inheritance;

public class Department implements Employee {

	public static void main(String[] args) {

		Employee employee = new Department();
		employee.Salary();
		employee.HR_Policy();
		
	}

	@Override
	public void Salary() {

		System.out.println("Salary granted for this month");
		
	}

	@Override
	public void HR_Policy() {

		System.out.println("HR Polocies applied");
		
	}

}
