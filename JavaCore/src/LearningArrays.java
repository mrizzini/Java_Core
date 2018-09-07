import java.util.Arrays;

public class LearningArrays {

	public static void main(String[] args) {

		int[] salary;

		salary = new int[10];
		
		String months[] = {"January", "February", "March"};
		
		System.out.println(months[0]);
		
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}
		
		// TWO DIMENSIONAL ARRAY
		
		int rows = 3;
		int columns = 3;
		
		int table[][] = new int[rows][columns];

		// assign the values in the first row
		table[0][0] = 10;
		table[0][1] = 11;
		table[0][2] = 12;
		
		// assign the values in the second row
		table[1][0] = 20;
		table[1][1] = 21;
		table[1][2] = 22;
		
		// assign the values in the third row
		table[2][0] = 30;
		table[2][1] = 31;
		table[2][2] = 32;
		
		// row length
		System.out.println(table.length);
		
		// column length
		System.out.println(table[0].length);
		
		System.out.println(table[0][0]);
		
		// print data in rectangular format
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(" "  + table[i][j]);
			}
			System.out.println(" ");
			
		}
		
		int sorter[] = new int[] {203, 20, 13, 103, -4};
		
		for (int i = 0; i < sorter.length; i++) {
			System.out.println(sorter[i]);
		}
		
		System.out.println("--------");
		Arrays.sort(sorter);
				
		for (int i = 0; i < sorter.length; i++) {
			System.out.println(sorter[i]);
		}
		
		
	}

}
