import java.io.*;

class Sum{


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array:");

		int size= Integer.parseInt(br.readLine());

	
		System.out.println("Enter array 1 element:");
		int arr1[] = new int[size];
		int add=0;


		for(int i=0 ;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0 ; i<arr1.length;i++){
			add=add+arr1[i];
		
		}

		System.out.println("The sum of all elements are :"+add);
	}	

	}



