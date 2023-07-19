class str_Demo{

	public static void  main(String[] args){

		String str1 = "shashi";

		String str2 ="ashish";

		int flag=0;
		char[] arr1=str1.tocharArray();
		char[] arr2=str2.tocharArray();

		if(arr1.length == arr2.length){
			flag=0;
			for(int i=0;i<arr1.length;i++){
				for(int j=o ;j<arr1.length;i++){
					if(arr1[j]==arr2[i]){
						flag++;
					}
				}
			}
		
		
		
		if(flag!=0){
			System.out.println("Given strings are anagram string");
		}
		else{
			System.out.println("Given Strings are not  anagram string");
		}

	}
	else{
		System.out.println("Given strings are not anagram string");
	}
	}
}

