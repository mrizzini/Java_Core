
public class WhileLoops {

	public static void main(String[] args) {

		int i = 1;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		
		int j = 12;
		
		// always runs at least once
		do {
			System.out.println(j);
			j++;
		}
		while (j <= 10);
		
	}

}
