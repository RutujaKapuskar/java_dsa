import java.io.*;
class Square_Demo{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number:");
		int count=0;
		int num= Integer.parseInt(br.readLine());
		int temp=num;
		for(int i=1 ;num!=0 ;i++)
		{
			num =num/10;
			count++;
		}


		int arr[] = new int[count];
		int j =0;
		while(temp!=0){

      			int num2= temp%10;
			if(num2%2==0){
				while(j<arr.length){
				arr[j] =num2*num2;
				j++;
				}

			temp=temp/10;
		}
		
		System.out.print(reverse(arr[]));
	}
}}




