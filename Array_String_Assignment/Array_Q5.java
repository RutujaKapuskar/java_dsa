//Find the second Largest number
import java.io.*;
class ArrDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int  arr[] =new int[5];
		int lgn1=0;
		int sgn2=0;
		
		System.out.println("Enter Elements in Array:");
		for(int i=0 ;i<arr.length ;i++){

			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]>=lgn1){
				//lgn1=arr[i];
				sgn2=lgn1;
				lgn1=arr[i];
			}

		}
		
		
		System.out.println("Second Largest Number"+sgn2);
	

		
	}
}

