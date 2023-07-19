import java.io.*;

class MergeArr{


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array:");

		int size= Integer.parseInt(br.readLine());

	
		System.out.println("Enter array 1 element:");
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		int arr3[] = new int[size+size];
		
		


		for(int i=0 ;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
			arr3[i]=arr1[i];
		}
		System.out.println("Enter array 2 element:");
		for(int i=0 ;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		for(int i = arr1.length ;i<arr3.length ;i++){
			for(int j = 0 ;j< arr2.length; j++){
			       arr3[i]=arr2[j];
			
			
			}
		}	
		
		for(int i =0 ;i < arr3.length;i++){
			System.out.println(arr3[i]);}
	}	

	}



