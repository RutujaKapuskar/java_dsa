// HashCode it will checks the content present in the two strings and 
// according to the string contenet will give the address if str1 have some content
// and str2 also have the same content wich is alrady present in the string str1 then will have the same address

class StringHashCodeDemo{

	public static void main(String[] args){

		String str1= "Shashi";
		String str2= new String ("Shashi");
		
		String str3= "Shashi";
		String str4= new String ("Shashi");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}





