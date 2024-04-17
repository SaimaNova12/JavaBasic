package basicjavasc;

import java.util.Scanner;

public class BEE1046 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(a==b) {
				System.out.println("O JOGO DUROU 24 HORA(S)\n");
			}
			else if(b>a) {
				System.out.println("O JOGO DUROU "+(b-a)+" HORA(S)");
			}
			else if(a>b) {
				b= b+24;
				System.out.println("O JOGO DUROU "+(b-a)+" HORA(S)");
			}
		}

	}

}
