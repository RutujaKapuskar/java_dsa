import java.io.*;
class ArrDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int  arr[] =new int[5];
		int count1=0;
		int count2=0;
		int arr2[]=new int[arr.length];
		int x=arr.length;
		System.out.println("Enter Elements in Array:");
		for(int i=0 ;i<arr.length ;i++){

			arr[i]=Integer.parseInt(br.readLine());
			
		}
		for(int i =0 ;i<arr.length;i++){
			arr2[x-1]=arr[i];
			x=x-1;
		}
		System.out.println("Reverse Array:");
		for(int i=0 ;i<arr.length;i++){
			System.out.println(arr2[i]);
		}

		//System.out.println(arr.reverse);


		
	}
}

