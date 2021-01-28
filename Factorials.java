package paris;

import java.util.Scanner;

//Factorials - Most people are familiar with the factorial operator in math. 5! yields 120
//because factorial means "multiply successive terms where each are one less than
//the previous: 5! -> 5 * 4 * 3 * 2 * 1 -> 120

public class Factorials {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		

		
		System.out.println("Please enter your number: ");
		int answer  = scan.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
	  boolean t = true;
		int g = 3;
		

		for (int i = 2; i < g; i++ ) {
			g = g + 1;
			if (a == 0) {
			a = answer ;
			System.out.print(a + "\n");
			b = a / i;
			c = b;
			System.out.print(b + "\n");
			continue;
			}
				
				
			b = c;
			
			b = b / i;
			c = b;
			System.out.print(b + "\n");
			if ((c == 1) || (c == 0)){
				break;
			}
			
		
		}
			
			if (!(c == 1)) {
				
				System.out.print("not a factor \n");
				
			}
			
			


			
			
			
			

		

	
	
	}

}
