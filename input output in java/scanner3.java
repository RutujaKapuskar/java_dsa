import java.util.Scanner;

// scanner is present in util lib of java

class Form{

	public static void main(String [] args){

	Scanner on = new Scanner(System.in);
	
	System.out.println("Enter Name");
	String name = on.next();
	System.out.println(name);
	
	System.out.println("Enter Age");
	int age =on.nextInt();
	System.out.println(age);
	}
}

