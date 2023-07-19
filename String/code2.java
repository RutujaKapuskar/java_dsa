class StringDemo{

	public static void main(String[] args){

		String str1="Core2Web";//When we initatilse string  this way string will go in SCP
		String str2=new String("Core2Web");//It will go in heap section
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		String str3="Core2Web";//will get reference of str1 object which is place at the  scp
		String str4=new String("Core2Web");//will create new object str and will have diifeence reference
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
		



