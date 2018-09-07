package OOP;


public class Department {

//	Non-static global variables
	
	public String dept_name;
	public int dept_id;
	public int no_of_emp;
	
	
//	Global static variable
	public static String company_name;
	
	
//	Non-static method
	public void add_dept() {
		System.out.println("Department added");
	}
	
//	Non-static method
	public void change_dept() {
		System.out.println("Department changed");
	}
	
//	Static method
	public static void national_holiday() {
		System.out.println("National holiday granted");
	}
	
}
