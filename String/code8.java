class StringDemo{
	
	public static void main(String[] args){
		
		String str1="Rutuja";

		String str2="Kapuskar";

		String str3= str1+str2;// when we use " + " operator to add the two strings it will internally calls the append method wich is present at StringBuilder class and the append method will return thr new String("RutujaKapuskar") string.
				       
		String str4=str1.concat(str2);// here the staak frame will be puch at the time of when it will use concat funtion it will internally call the same method wich will be present at StringBuilder

		System.out.println(str3);//it have different address
		System.out.println(str4);//have different address
	}
}
