class StringDemo{

	public static void main(String[] rutu){

		String str1="Rutuja";
		String str2= "Kapuskar";

		System.out.println(str1+str2);

		String str3="RutujaKapuskar";

		String str4 =str1+str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
