package BASIC;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		fun(2,3,4,5,6,7);//this means taking variable length of arguments
		fun();//empty array 
		
		mix(2,3,"Rutuja","dipti","Avani");
		
		
		
		
		//we can pass 0 or more than zero arguments to the method
		
		
	}
	//when you don't know about how many parameters you are passing you will give it as (int ...arr)that means you are passing array to that funtion
	
	//suppose you wants to pass like mix or multiple arguments then 
	static void mix(int a,int b ,String ...v) {
		System.out.println(a + "  "+ b + Arrays.toString(v));
		//here veriable length argument must be the last in the this give list
		//that is if you write it as
		//static void mix(int a,String ...v,int b);
		//it will throw runtime error
	}
	
	
	
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
}
 