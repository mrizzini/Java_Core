
public class IfElseStatements {

	public static void main(String[] args) {

		int num = (int)(Math.random() * 20); 
		System.out.println(num);
		
		if(num >= 10)
			System.out.println(num + " is greater than or equal 10");
		else if (num < 10 && num > 5)
			System.out.println(num + " between 5 and 10");
		else
			System.out.println(num + " is less than 10");
	}

}
