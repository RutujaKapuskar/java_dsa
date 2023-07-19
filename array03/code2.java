import java.io.*;
class Demo{

	


	void comp(int arr[]){


		for(int i=0 ;i< arr.length;i++){

			int count=0;

			for(int j =1;j<=arr[i];j++){
				
				if(arr[i]%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.println("Number "+arr[i]+"is prime  at index of array"+i);
			}
			else
				System.out.println("Number"+arr[i] +"is  composite"); 

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


