
public class boolean_datatype {

	public static void main(String[] args) {

		boolean bool = true;
		
		System.out.println(10 < 20);
		
		int first_no = 10;
		int sec_no = 20;
		int third_no = 30;
		
		
		boolean result = first_no > sec_no;
		
		System.out.println(result);
		
		if (first_no > sec_no && first_no > third_no)
			System.out.println("first num " + first_no + " is greater than " + sec_no);
		else if (sec_no > first_no && sec_no > third_no)
			System.out.println("second num " + sec_no + " is greater than " + first_no);
		else
			System.out.println("third num is greater " + third_no);
		
		
		String abc = "Welcome to selenium tutorial";
		String def = "Welcome to selenium tutorial";
		
		if (abc == def)
			System.out.println("Both strings are equal");
		else
			System.out.println("strings are not equal");
		
	}

}
