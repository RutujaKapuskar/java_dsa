import java.io.*;
class CountD{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");

		int num= Integer.parseInt(br.readLine());

		int count=0;
		int temp=num;

		while(temp!=0){

      			int num2= temp%10;
			if(num2%2!=0){
				count++;
			}

			temp=temp/10;
		}
		System.out.println(count);
	}
}



