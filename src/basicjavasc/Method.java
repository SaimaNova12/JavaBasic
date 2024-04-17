package basicjavasc;

public class Method {

	
	public static void addition(int x, int y) {
		System.out.println("Result : "+(x+y));
	}
	
	public void sub(int x, int y){
		System.out.println("Result : "+(x-y));
	}

	public static void main(String[] args) {
		//add
       addition(10,20);
       addition(50,70);
       addition(70,30);
       //sub
       Method obj = new Method();
       obj.sub(20,10);
	}

}
