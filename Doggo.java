package qa.com;

public class Doggo {
	
	public static void main(String[] args) {
		
		task1(403201);
		
		
	}

	public static void task1(int val) {
		int i = 1;
		
		while( val != 1) {
			if(val % i != 0) {
				System.out.println("error, did not divide correctly");
				break;
			}
			
			
			System.out.println("Val " + val + " divided by " + i + "=" + (val/=i));
			i++;
			System.out.println(i-1);
			
		}
		
		
		
		
		
	}

}
