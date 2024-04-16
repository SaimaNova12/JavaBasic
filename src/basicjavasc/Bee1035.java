package basicjavasc;

import java.util.Scanner;

public class Bee1035 {

	public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	     var a = input.nextInt();
	     var b = input.nextInt();
	     var c = input.nextInt();
	     var d = input.nextInt();
	     var sum1 = c+d ;
	     var sum2 = a+b ;
	     if(b > c && d > a && sum1 > sum2 && c>0 && d>0 && a%2==0) {
	    	 if(sum1 > sum2) {
	    		 if(c>0 && d>0) {
	    			 if(a%2==0) {
	    				 System.out.println("Valores aceitos\n");
	    			 }
	    		 }
	    	 }
	     }
	     else {
	    	 System.out.println("Valores nao aceitos\n");
	     }
	     

	}

}
