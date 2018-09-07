
public class Methods {

	public static void print() {
		System.out.println("Learning functions");
	}
	
	public static int a = 30;
	public static int b = 20;
	
	public static void addNumbers() {
		int c = a + b;
		System.out.println("Addition of the two numbers is : " + c);
	}
	
	public static void addNumbers(int num1, int num2)
	{
		int add = num1 + num2;
		System.out.println("Addition of the two numbers is : " + add);
	}
	
	public static void table(int t) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(t * i);
		}
	}
	
	
	public static void main(String[] args) {

		print();
		addNumbers();
		addNumbers(50, 100);
		table(4);
	}

}
