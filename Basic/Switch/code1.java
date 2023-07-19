class  SwitchDemo{
	public static void main(String[] args){
		int x =3;
		//here we not given break to case because of that if any case is match after that case all the case will be satistfied and give all the result after that 
		switch(x){

			case 1 : 
				System.out.println("One ");
			case 2 :
				System.out.println("Two");
			case 3 :
				System.out.println("Three");
			case 4 :
				 System.out.println("Four");
			case 5 : 
				 System.out.println("five");
			default :
				 System.out.println("no case is matched");

		}
	}
}


