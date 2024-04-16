package basicjavasc;

import java.util.Scanner;

public class BEE1037 {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			var a = input.nextFloat();
					if(a>=0 && a<=25){
			        System.out.println("Intervalo [0,25]\n");
			    }
			    else if(25.00<a && a<=50.00){
			    	System.out.println("Intervalo (25,50]\n");
			    }
			    else if(50.00<a && a<=75.00){
			    	System.out.println("Intervalo (50,75]\n");
			    }
			    else if(75.00<a && a<=100.00){
			    	System.out.println("Intervalo (75,100]\n");
			    }
			    else if(a<0.00 || a>100.00){
			    	System.out.println("Fora de intervalo\n");
			    }
		}

	}

}
