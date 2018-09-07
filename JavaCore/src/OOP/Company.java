package OOP;

public class Company {

	public static void main(String[] args) {

		Department department = new Department();
		Department department2 = new Department();
		
		
		department.dept_id = 10;
		department.dept_name = "Telecom";
		department.no_of_emp = 1000;
		Department.company_name = "Microsoft";
		Department.national_holiday();
		
		department.add_dept();
		department.change_dept();
		
		System.out.println("Department ID: " + department.dept_id);
		System.out.println("Department Name: " + department.dept_name);
		System.out.println("Number of employees: " + department.no_of_emp);
		
		
		department2.dept_id = 101;
		department2.dept_name = "Sales";
		department2.no_of_emp = 5000;
		
		department2.add_dept();
		department2.change_dept();
		
		System.out.println("Department ID: " + department2.dept_id);
		System.out.println("Department Name: " + department2.dept_name);
		System.out.println("Number of employees: " + department2.no_of_emp);
		
		
	}

}
