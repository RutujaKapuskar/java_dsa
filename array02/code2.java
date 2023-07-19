import java.io.*;

class NuOE{


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array:");

		int size= Integer.parseInt(br.readLine());

	
		System.out.println("Enter array 1 element:");
		int arr1[] = new int[size];
		int count1=0;
		int count2=0;

		for(int i=0 ;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0 ; i<arr1.length;i++){
		
			if(arr1[i]%2==0){
				count1++;
			}
			else
				count2++;
		
		
		}

		System.out.println("The  even elements are :"+count1);
		System.out.println("The  odd elements are:"+count2);
	}	

	}



