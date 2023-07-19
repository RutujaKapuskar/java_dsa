import java.io.*;
class CountD{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");

		int num= Integer.parseInt(br.readLine());

		int count=0;
		int temp=num;

		while(num!=0){

			num= num/10;
			count++;
		}
		System.out.println(count);
	}
}



