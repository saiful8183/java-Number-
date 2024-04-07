package numberPractice;

public class SkippingNumbers {
	/*
	 * Create a function using while loop to print numbers from 65 to 80 where 74 to
	 * 76 will be skipped.
	 */

	public static void main(String[] abc) {
/*
		int start = 10;

		while (start <= 20) {

			if (start >= 11 && start <= 16) {
				start++;
				continue;

			}

			System.out.println(start);

			start++;

		}

		*/
		
		
		
		  
		  int start = 65;
		  
		  while (start <= 80) {
		  
		  if (start >= 74 && start <= 76) { 
			  start++; 
			  continue; }
		  System.out.println(start); start++; }
		 
	}

}
