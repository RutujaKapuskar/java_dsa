class pattern{
	/*

	   F  5  D  3  B  1
	   F  5  D  3  B  1
	   F  5  D  3  B  1
	   F  5  D  3  B  1
	   F  5  D  3  B  1
	   F  5  D  3  B  1
	*/
       public static void main(String[] args){

       for(int i=1 ;i<=6;i++){
	       int k=70;
	       int p=6;
       		for(int j=1;j<=6;j++){
	 		if(j%2==0)
					System.out.print( p+" ");
       			else{
		
				System.out.print((char)k + " ");
				
			}
			k--;
			p--;
       
       
		}      System.out.println();
       
}
}}
