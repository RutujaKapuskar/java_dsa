import java.io.*;

class Search{


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array:");

		int size= Integer.parseInt(br.readLine());

	
		System.out.println("Enter array 1 element:");
		int arr1[] = new int[size];
	

		for(int i=0 ;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter the  Element YouWant to Search:");

		int num = Integer.parseInt(br.readLine());

		for(int i=0 ; i<arr1.length;i++){
			if(arr1[i]==num){
				System.out.println("Number is at Index"+ i );
				//when you want to exit from our loop when condition is satisfied then type System.exit()
				System.exit(0);// end the given for loop 
			}
		}
		//And then Write the Statement after for loop
		System.out.println("Number is not there!");
	}	

	}



