package numberPractice;

public class PrimeNumber {

	public static void main(String[] args) {

// Natural number>1
//Which has only 2 factors 1 and itself
//19=>1 and 19=>prime Number
//28 =>1,2,4,7,14,28 =>not a prime number

		/*
		 * int num = 3; 
		 * int count = 0;
		 * 
		 * if (num > 1) {
		 * 
		 * for (int i = 1; i <= num; i++) {
		 * 
		 * if (num % i == 0)
		 * 
		 * count++;
		 * 
		 * } if (count == 2) {
		 * 
		 * System.out.println("PrimNumber");
		 * 
		 * } else {
		 * 
		 * System.out.println("Not a prime number");
		 * 
		 * }
		 * 
		 * } else {
		 * 
		 * System.out.println("Not a prime number"); }
		 */
		
		
		
		
	                      	//or
		
		
		

		int num = 27;
		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				count++;
			}
		}

		if (count == 2) {

			System.out.println("PrimNumber");

		} else {

			System.out.println("Not a prime number");

		}

	}

}
