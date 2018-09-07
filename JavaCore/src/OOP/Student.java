package OOP;

public class Student {

	String name;
	int rollNumber;
	int age;
	
	
//	Constructors are automatically called when class is instantiated
//	This is a constructor
	public Student() {
		System.out.println("Adding student's records");
	}
	
//	Can pass arguments
	public Student(String name, int age, int rollNumber) {
		this.name = name; // this.name refers to the global variable name
		this.age = age;
		this.rollNumber = rollNumber;
	}
	
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Tom";
		s1.rollNumber = 1;
		s1.age = 14;
		
		Student s2 = new Student();
		s2.name = "Jack";
		s2.rollNumber = 2;
		s2.age = 15;
		
		Student s3 = new Student("Raman", 16, 3);
		System.out.println("Argumented constructor name: " + s3.name);
		System.out.println("Argumented constructor age: " + s3.age);
		System.out.println("Argumented constructor roll: " + s3.rollNumber);

		
	}

}
