import java.io.*;

class ArrayDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of Array");
		int size = Integer.parseInt(br.readLine());


		int arr[] = new int[size];

		for(int i =0 ; i<size; i++){
			
			arr[i]=Integer.parseInt(br.readLine());

		
		}
		for(int i = 0 ; i< arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

