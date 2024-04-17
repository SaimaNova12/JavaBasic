package basicjavasc;

import java.util.Scanner;

public class BEE1045 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			
			double temp;

			 if(a<b){
			        temp = a;
			        a = b;
			        b= temp;
			    }
			    if(a<c){
			        temp = a;
			        a = c;
			        c= temp;
			    }
			    if(b<c){
			        temp = b;
			        b = c;
			        c = temp;
			    }

			    if(a >= (b + c))
			    {
			        System.out.println("NAO FORMA TRIANGULO\n");
			    }
			    if((a*a) == (b*b)+(c*c)){
			    	System.out.println("TRIANGULO RETANGULO\n");
			    }
			    if((a*a)>((b*b)+(c*c))){
			    	System.out.println("TRIANGULO OBTUSANGULO\n");
			    }
			    if((a*a)<(b*b)+(c*c)){
			    	System.out.println("TRIANGULO ACUTANGULO\n");
			    }
			    if(a==b && a==c && b==c){
			    	System.out.println("TRIANGULO EQUILATERO\n");
			    }
			     if((a==b && a!=c)|| (b==c && a!=c)){
			    	 System.out.println("TRIANGULO ISOSCELES\n");
			    }
		}
	}

}
