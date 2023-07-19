import java.io.*;
class Demo{

	


	void comp(int arr[]){

		for(int i=0 ;i<arr.length;i++){
			int sum=0;
			int temp=arr[i];
			int fl=0;
			for(int j=1 ;j<=temp;j++){
				if(temp%j==0){
				     sum=sum+j;
			
			if(sum ==arr[i]){
				fl=1;
			
			}

				}
				
			}
			if(fl==1){
				System.out.println("Number"+arr[i]+"is perfect number");
				
			}
			else
				System.out.println("Number"+arr[i]+"is not perfect");

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


