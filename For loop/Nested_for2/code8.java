class pattern{
	/*
	  A b C d
	  E f G h
	  I j K l
	  M n O p
		*/
       public static void main(String[] args){
	int k =1;
       for(int i=1 ;i<=4;i++){
       		for(int j=1;j<=4;j++){
	 		if(j%2==0)
			System.out.print((char)(96+k) +" ");
      
			else
			 System.out.print((char)(64+k) + " ");	
				
			k++;
		}

       
       
       System.out.println();
       }
}
}
