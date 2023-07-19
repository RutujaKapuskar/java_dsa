import java.util.Scanner;

class Scanner_demo{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);


		System.out.println("Enter Dream comapny :");

		String Cname =obj.next();

		System.out.println("Enter the package :");

		int pack= obj.nextInt();

		System.out.println(Cname +"Is my dream company");
              

		System.out.println(pack +"is my ctc");

	}
}

