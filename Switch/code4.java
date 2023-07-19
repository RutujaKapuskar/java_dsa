class SwitchDemo{
	public static void main(String[] args){
		int x =3 ;
		 int a =1 ;
		 int b =2 ;
		// here given case contains variables but required constant values  which  will throws Error: constant expression required 
		 switch(x){

			 case a :
				 System.out.println("1");
				 break;

			case b :
				 System.out.println("3");
				 break;

			case a+b :
				 System.out.println("3");
				 break;

			default : 
				 System.out.println("Invalid");
				 break;
		 }
	}

}

