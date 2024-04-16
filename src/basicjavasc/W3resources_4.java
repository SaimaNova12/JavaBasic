package basicjavasc;

import java.util.Scanner;

public class W3resources_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three side of the triangle : ");
		var side1 = input.nextInt();
		var side2 = input.nextInt();
		var side3 = input.nextInt();
		var s = (side1 + side2 + side3) / 2;
		var area = Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));

		System.out.println(area);

	}

}
