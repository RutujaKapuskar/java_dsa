import java.io.*;

class Minim{


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array:");

		int size= Integer.parseInt(br.readLine());

	
		System.out.println("Enter array 1 element:");
		int arr1[] = new int[size];
	

		for(int i=0 ;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		
		int min=arr1[0] ;
		for(int i=0 ; i<arr1.length ;i++){
				if(arr1[i]<min){
					min=arr1[i];
				}
		}


      System.out.println("Min is "+ min);
	}	

	}



