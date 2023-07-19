class StringDemo{

	public static void main(String[] args){

		String str1="Rutuja";
		String str2="Kapuskar";

		System.out.println(str1);
		System.out.println(str2);

		str1.concat(str2);//here the str1 will concat with str2 but we not store it in any variable
		//beacuse of that it will hava the be creted at the heap section but will not have any refrence then it will be collected by the garbage collector
		System.out.println(str1);
		System.out.println(str2);
	}
}
