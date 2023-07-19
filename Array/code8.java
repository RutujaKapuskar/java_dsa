import java.io.*;

class arr{
	
	public static void main(String[] ar)throws IOException{
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		int  arr[] = new int[5];

		for(int i = 0 ; i<arr.length;i++){
			
			 
			arr[i]= Integer.parseInt(br.readLine());
	
	        

		}
		for(int i =0 ;i<arr.length; i++){
			System.out.println(arr[i]);
		}	
}
}


