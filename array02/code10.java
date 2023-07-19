import java.io.*;

class DigitAddEve{


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array:");

		int size= Integer.parseInt(br.readLine());


		int arr[] = new int[size];
		//int add=0;


		for(int i=0 ;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		for(int i =0 ;i<arr.length;i++){
			int temp=arr[i];
			int add =0 ;
			for(int j=0;temp!=0;j++){

				int num = temp%10;

				add =add+num;

				temp=temp/10;
			}
		if(add%2==0)
			System.out.println(arr[i]);

	}	
	}}



