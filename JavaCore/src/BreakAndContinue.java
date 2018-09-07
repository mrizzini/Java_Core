
public class BreakAndContinue {

	public void go() {
		
		System.out.println("First");
		
		System.out.println("Last");
	}
	
	
	public static void main(String[] args) {

		BreakAndContinue b = new BreakAndContinue();
		b.go();
		
//		for(int i = 0; i < 10; i++) {
//			
//			if (i == 5)
//				break;
//			
//			System.out.println(i);
//		}
		
		
		for(int i = 0; i < 10; i++) {
			
			if (i % 2 ==  0)
				continue;
			
			System.out.println(i);	
		}
		
		
	}

}
