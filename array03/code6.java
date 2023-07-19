import java.io.*;
class Demo{

	


	void comp(int arr[]){

		for(int i=0 ;i<arr.length;i++){
			int count=0;
			int temp=arr[i];

			for(int j=1;temp!=0;j++){
				int num=temp%10;
			      	count++;
				temp=temp/10;
			}
			
			System.out.println(count);
				

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


