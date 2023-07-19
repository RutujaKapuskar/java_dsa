class RCB{

	public static void main(String[] args){


		int arr1[]={10,20,30,40,50};

		char arr2[]={'A','B','C'};

		float arr3[]={10.5f,20.5f};


//Interger array
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		//character array
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
               
		// float Array
	       
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		// in below code there is runtime exception ie. arrayindexout of bound
		System.out.println(arr3[2]);//When we try to access extra indexfrom an array it will throws the runtime exception 
	}
}

