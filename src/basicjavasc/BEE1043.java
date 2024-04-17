package basicjavasc;

import java.util.Scanner;

public class BEE1043 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			var a = input.nextFloat();
			var b = input.nextFloat();
			var c = input.nextFloat();
			
			float perimeter=0, area=0;
			
			if((a+b)>c && (b+c)>a && (c+a)>b) {
				System.out.println("Perimetro : " +(a+b+c));
			}
			else {
				area = (float) (0.5*(a+b)*c);
				System.out.println("Area : " +area);
			}
		}
        
	}

}
