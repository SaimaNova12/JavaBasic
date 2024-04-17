package basicjavasc;

import java.util.Scanner;

public class BEE1044 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			var x = input.nextInt();
			var y = input.nextInt();
			int temp;
			
		    if(x>y){
		        temp = x;
		        x = y;
		        y = temp;
		    }
			
			if(y%x ==0) {
				System.out.println("Sao Multiplos\n");
			}
			else {
				System.out.println("Nao Sao Multiplos\n");
			}
		}

	}

}
