class Demo{
	public static void main(String[] args){
		byte var1=18;
		byte var2=18;

		System.out.println(var1);
		System.out.println(var2);

		var1=var1+var2;
/*		code1.java:9: error: incompatible types: possible lossy conversion from int to byte
		var1=var1+var2;
		         ^
1 error
*/

/* Solution :  in java when we perform any operation on number in runtime  at that time output of that number is consideer as 
 * bydeafult as INTEGER.
 * SHORT AND BYTE IS WORK SAME AS INTERGER*/

		System.out.println(var1);
	}
}

