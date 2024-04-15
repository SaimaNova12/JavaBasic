package basicjavasc;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.println("Enter a Numbers ");
	    int number1 = input.nextInt();
	    int number2 = input.nextInt();
	    int number3 = input.nextInt();
	    
	    if(number1>number2) {
	    	System.out.println(number1+" is grater than "+number2);
	    }
	    else if(number2>number1) {
	    	System.out.println(number2+" is grater than "+number1);
	    	
	    }*/
		System.out.println("Enter your expected text ");
		String text1 = input.nextLine();
		
		System.out.println("Enter your main text ");
		String text2 = input.nextLine();
		
		if(text1.equals(text2)) {
			System.out.println(text1+" is exact similar to "+text2);
		}
		else if(text1.equalsIgnoreCase(text2)) {
			System.out.println(text1+" is similar to "+text2);
		}

	}

}
