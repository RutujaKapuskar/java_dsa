package BASIC;
import java.io.*;
class Comp{
	
	  int[] comp(int[] nums , int target){
		
		int retArr[]=new int[2];
		
		for(int i =0; i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					retArr[0]=i;
					retArr[1]=j;
					
					
				}
				
					
			}
		}
		
		return retArr;	
		
	}

}
public class Array1 {
	

	public static void main(String[] args)throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of Array:");
		int size =Integer.parseInt(br.readLine());
		
		System.out.println("Enter the Target Vale");
		int target= Integer.parseInt(br.readLine());
		
		
		int arr[] = new int[size];
		
		System.out.println("Enter Element");
		for(int i = 0 ;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		
		int arr1[]=new int[2];
		Comp obj =new Comp();
		arr1 =obj.comp(arr,target);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);

	}

}
