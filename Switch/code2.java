class  SwitchDemo{
	public static void main(String[] args){
		int x =3;
		//here we hsve given break to case because of that if any case is match after that case it will break the switch  statement 
		switch(x){

			case 1 : 
				System.out.println("One ");
				break;
			case 2 :
				System.out.println("Two");
				break;

			case 3 :
				System.out.println("Three");
				break;

			case 4 :
				 System.out.println("Four");
				 break;

			case 5 : 
				 System.out.println("five");
				 break;

			default :
				 System.out.println("no case is matched");
				 break;

		}
	}
}


