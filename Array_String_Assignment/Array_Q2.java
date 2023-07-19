import java.io.*;
class ArrDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int  arr[] =new int[5];
		int larger=0;
		
		System.out.println("Enter Elements in Array:");
		for(int i=0 ;i<arr.length ;i++){

			arr[i]=Integer.parseInt(br.readLine());
			if(larger<arr[i]){
				larger=arr[i];
			}
		}
		System.out.println("larger Element in array"+ larger);
		
	}
}

