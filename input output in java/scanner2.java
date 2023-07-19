import java.io.*;

class BrDemo{
	
	public static void main(String[] args) throws IOException{


		
		InputStreamReader obj = new InputStreamReader(System.in);

		BufferedReader obj2 = new BufferedReader(obj);



		System.out.println("Enter the numbr:");

		int num = Integer.parseInt(obj2.readLine());


		System.out.println(num );



		System.out.println("Enter the String: ");

		String st = obj2.readLine();
	}
}


		
