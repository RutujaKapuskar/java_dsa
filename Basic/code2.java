class Demo2{
	public static void main(String[] args){
		float f1=7.5f;
		float f2= 7.5f;
		/*code2.java:3: error: incompatible types: possible lossy conversion from double to float
		float f1=7.5;
		         ^
code2.java:4: error: incompatible types: possible lossy conversion from double to float
		float f2= 7.5;
		          ^
2 errors
error: compilation failed
*/
/* SOLUTION:if we float as datatype if we not give f postfix to the number it will consider as the double and datatype is 
 * float thats why it will give you error as incompatiable type .
 { so use ==>      float f1= 7.5f;
 		   float f2=7.5f;
 */
 
  System.out.println(f1);
		System.out.println(f2);
	}
}

