package BASIC;

public class Method {
// Swap numbers without using third veriable
	public static void main(String[] args) {
	int x =10;
	int y =20;
	
	System.out.println(x);
	System.out.println(y);
	
	x= x+y;
	y =x-y;
	x= x-y;
	System.out.println("x :" +x);
	System.out.println("y :" +y); 
	
	}
	
}
