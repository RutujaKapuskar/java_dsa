// Accessing Elements from an array

class ArrayDemo{

	public static void main(String[] args){
		
		int arr[] ={10,20,30,40,50};

		//without for loop
		
		System.out.println("accessing elements without for loop");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		//by usinf for loop
		System.out.println("Accessing elements by using for loop");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	
	}
}

