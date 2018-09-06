
public class LearningMethods {

	public void show() {
		int a;
		int b;
		String c;
	}
	
//	Display method
	public int display(int k, String a, char c, float f, boolean b) // declaring --> define
	{
		System.out.println("Displaying message inside Display Method");
		
		return 10;
		
	}
	
	
	public static void main(String[] args) {

		LearningMethods learn = new LearningMethods();
		learn.show();
		
		LearningMethods learn1 = new LearningMethods();
		learn1.show();
		
		Home h = new Home(); // h --> Object1 --> i = 10
		h.i++; // Object1 -> i = 11
		
		Home h1 = new Home(); // h1 --> Object2 --> i = 10
		h1.i++; // Object2 --> i = 11;
		
		Home h2 = new Home(); // h2 --> Object3 --> i = 10
		System.out.println(h2.i); // 10
		
		Calculator calculate = new Calculator();
		System.out.println(calculate.add(300, 5));
		System.out.println(calculate.sub(300, 5));		
		System.out.println(calculate.mul(300, 5));
		System.out.println(calculate.div(300, 5));
		
		
		
	}

}
