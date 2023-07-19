import java.io.*;
class ArrDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int  arr[] =new int[5];
		int count1=0;
		int count2=0;
		
		System.out.println("Enter Elements in Array:");
		for(int i=0 ;i<arr.length ;i++){

			arr[i]=Integer.parseInt(br.readLine());
			
		}
		for(int i=0 ;i<arr.length ;i++){
			if(arr[i]%2==0){
				count1++;
			}
			else{
				count2++;
			}
		}
		System.out.println("Count of Even number"+count1);
		System.out.println("Count of odd number"+ count2);

		
	}
}

