/* in this code there is error because of we have given char  and number of same value if case 
 * ch =65 is given which is integer and then it will first match to char A and next it will match to num 65 
 * here ther is dupilcate case  is given because of that it will threw error compiler will not understant the given case */


class Demp{

	public static void main(String[] args){
		int ch = 65 ;

		switch(ch){

			case 'A':
				System.out.println("char - A");
				break;
			case 65 :
				 System.out.println("Num 65");
				 break;
			case 'B':
				 System.out.println("char - B");
				 break;
			default :
				 System.out.println("Invalid");
				 break;

			}
	}
}

