class StrDemo{

		public static void main(String [] aregs){


			String str1= "Rutuja";

			String str2 =new String("Rutuja");

			if(str1==str2){
				System.out.println("Equal");
                                   //here == will checks the identityHashCode of the string and as we khow that the identity hash code will be different because here on str2 will be on heap section and str1 will be inside of the String constant pool therefore the output will be not equal
			}
			else{
				System.out.println("not Equal");
			}

			if(str1.equals(str2)){
				System.out.println("Equal");//basicaly equals method will check the content in the string and will give the output as per the contant present in the string
			}
			else{
				System.out.println("Not Equal");
			}
		}
}
