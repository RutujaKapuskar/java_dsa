import java.io.*;
class lengthDemo{

	static int MyStrlength(String St){

		char arr[] = St.toCharArray();
		int count=0;
		for(int i=0 ;i<arr.length ;i++){
			count++;
		}
		return count;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String:");
		String str1 =br.readLine();

		System.out.println(MyStrlength(str1));
		System.out.println(str1.length());
	}
}
		
