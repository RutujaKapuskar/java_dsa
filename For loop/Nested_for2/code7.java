class pattern{
	/*
	 1  2  9
	 4  25 6
	 49 8  81


*/
       public static void main(String[] args){
	int k=1;
       for(int i=1 ;i<4;i++){
       		for(int j=1;j<4;j++){
			if((i+j)%2==0)
	 		System.out.print(k*k +"   ");
      			else
				System.out.print(k+"   ");
			k++;
	       	
		}

       
       
       System.out.println();
       }
}
}
