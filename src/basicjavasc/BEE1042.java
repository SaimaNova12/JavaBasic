package basicjavasc;

import java.util.Scanner;

public class BEE1042 {

	public static void main(String[] args) {
   
		Scanner input = new Scanner(System.in);
		var a = input.nextInt();
		var b = input.nextInt();
		var c = input.nextInt();
        int temp, x, y, z ;
		    x = a;
		    y = b;
		    z = c;
		    if(a>b){temp = a; a = b; b = temp;}
		    if(a>c){temp = a; a = c; c = temp;}
		    if(b>c){temp = b; b = c; c = temp;}

		    System.out.println(a+"\n"+b+"\n"+c);
		    System.out.println(x+"\n"+y+"\n"+z);

		}
	}

