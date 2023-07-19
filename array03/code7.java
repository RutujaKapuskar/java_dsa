import java.io.*;
class Demo{

	


	void comp(int arr[]){

		for(int i=0 ;i<arr.length;i++){
	
			int temp=arr[i];
			int sum=0;
		        int mul=1;
			int num=temp%10;
			
			for(int j=1;temp!=0;j++){
		//	        int mul=1;
		//		int num=temp%10;
			      for(int k=1 ;k<=temp;k++){
				      mul=mul*k;
			      }
			       sum=sum+mul;
				//temp=temp/10;
			}
			temp=temp/10;
			if(arr[i]==sum){

			      System.out.println(arr[i]+"is Strong number at index"+i);
			}
			
			}
	}
	

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array:");
		int size=Integer.parseInt(br.readLine());

		int arr[]= new int[size];
		System.out.println("Enter the Array Element:");


		for(int i =0 ;i<arr.length; i++){

			arr[i]=Integer.parseInt(br.readLine());
		}
		Demo obj = new Demo();

		obj.comp(arr);
			
	}

}


