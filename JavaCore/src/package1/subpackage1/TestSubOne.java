package package1.subpackage1;

import teacherPackage.*;
// instead of the below
//import teacherPackage.TeacherLogin;
//import teacherPackage.TeacherSubject;

public class TestSubOne {

	public static void main(String[] args) {
		
		TeacherLogin teacher = new TeacherLogin();
		teacher.testTeacherLogin();
		teacher.name = "Ramen";
		
		TeacherSubject subject = new TeacherSubject();
		subject.subject = "Computer Science";
		
	}
	
	
}
