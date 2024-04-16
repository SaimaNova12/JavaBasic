package basicjavasc;

import java.util.Scanner;

public class W3resources6 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			var year = input.nextInt();
			
			if(year % 400 == 0 ) {
				System.out.println(year+" is leap year");
			}
			else if(year % 4 == 0 && year % 100 != 0) {
				System.out.println(year+" is a leap year");
			}
			else {
				System.out.println("This is not a leap year");
			}
		}
	}

}
