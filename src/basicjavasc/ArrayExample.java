package basicjavasc;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		
    /*String[] names = {"Saima", "Israt", "Nova", "Sabiha"};
    System.out.println(names[0]);
    System.out.println(names[1]);
    System.out.println(names[2]);
    System.out.println(names[3]);*/
		
		//ArrayList
		ArrayList<String> names = new ArrayList<String>();
		names.add("Saima");
		names.add("Binta");
		names.add("Israt");
		names.add("Arian");
		System.out.println(names);
		System.out.println(names.get(2));
		names.remove(1);
		System.out.println(names);
		System.out.println(names.size());
		names.clear();
		System.out.println(names);
	}

}
