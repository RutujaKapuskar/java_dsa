class pattern{
	/*
		1    4    9
       		16   25   36
       		49   64   81       
 	 */
       public static void main(String[] args){
	int k=1;
       for(int i=1 ;i<4;i++){
       		for(int j=1;j<4;j++){
	 		System.out.print(k*k+"   ");
			k++;
       }
       
       
       System.out.println();
       }
}
}
