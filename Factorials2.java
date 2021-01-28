package paris;

import java.util.Scanner;

//Factorials - Most people are familiar with the factorial operator in math. 5! yields 120
//because factorial means "multiply successive terms where each are one less than
//the previous: 5! -> 5 * 4 * 3 * 2 * 1 -> 120

public class Factorials2 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		

		
		System.out.println("Please enter your number: ");
		int answer  = scan.nextInt();
		
		
		for (int i = 1; i < 101 ; i ++) {
			
			if ( i == answer) {
				
			} else if ( i == 1 ) 
			{
				
				System.out.println(i + "st");
				
			} else { 
				
				System.out.println(i + "th");
			}
			
		
	}
	
		}
			
			
			
			

		



}
