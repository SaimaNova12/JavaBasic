package basicjavasc;

public class Method2 extends Method{
	
	public static void multi(int x, int y, int z) {
		System.out.println("Result : " +(x*y*z));
	}
	
	public static void main(String[] args) {
		
       Method obj = new Method();
       obj.addition(10, 20);
       
      //multiplication
       multi(5,5,5);
	}

}
