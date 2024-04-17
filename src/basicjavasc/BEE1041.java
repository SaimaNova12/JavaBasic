package basicjavasc;

import java.util.Scanner;

public class BEE1041 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			var value1 = input.nextFloat();
			var value2 = input.nextFloat();
			
			if(value1 > 0 && value2 > 0) {
				System.out.println("Q1");
			}
			else if(value1 < 0 && value2 > 0) {
				System.out.println("Q2");
			}
			else if(value1 < 0 && value2 < 0) {
				System.out.println("Q3");
			}
			else if(value1 > 0 && value2 < 0) {
				System.out.println("Q4");
			}
			else if(value1 == 0 && value2 == 0) {
				System.out.println("Origem");
			}
			else if(value1 == 0 && (value2 > 0 || value2 < 0)){
				System.out.println("Eixo Y\n");
			}
			else if(value2 == 0 && (value1 > 0 || value1 < 0)){
				System.out.println("Eixo X\n");
			}
		}

	}

}
