class pattern{
	/*26  Z  25  Y
	  24  X  23  W
	  22  V  21  U
	  20  T  19  S
	*/
       public static void main(String[] args){
       char Ch='Z';
       int num=26;
       for(int i=1 ;i<=4;i++){
	        
       		for(int j=1;j<=4;j++){
			if(j%2==0){
				
	 		System.out.print(Ch-- +"  ");
       }
       else{
	       System.out.print(num-- +" ");
       }

       
		}
       System.out.println();
       }
       }
}

