import java.io.*;
class ArrDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int  arr[] =new int[5];
		int small=0;
		
		
		System.out.println("Enter Elements in Array:");
		for(int i=0 ;i<arr.length ;i++){

			arr[i]=Integer.parseInt(br.readLine());
			if(small>arr[i]){
				small=arr[i];
			}

		}
		System.out.println("Smallest number is:"+small);

		

		
	}
}

