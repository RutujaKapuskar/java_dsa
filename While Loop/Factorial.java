import java.io.*;

class FactDemo{


	public static void main(String[] args)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number to calculate its factorial");

		int num=Integer.parseInt(br.readLine());
		int i=1;
		int temp=1;
		while(i<=num){
			temp=temp*i;
			i++;
		}
		System.out.println(temp);
	}
}

