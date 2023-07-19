class pattern{
	/*1C3   4B2   9A1
	  16C3  25B2  36A1
	  49C3  64B2  91A1
	*/
       public static void main(String[] args){
	int k=1;
       for(int i=1 ;i<4;i++){
	       char ch='C';
	       int n=3;
       		for(int j=1;j<4;j++){

	 		System.out.print(k*k+"" +(char)ch--+"" +n-- +" ");
       			k++;
		}
       
       
       System.out.println();
       }
}
}
