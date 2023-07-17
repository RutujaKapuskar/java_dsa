package BASIC;
import java.io.*;
class Solution {
    public int maxProfit(int[] prices) {
        int prof =0;
        int flag=0;
        for(int i=0 ;i<prices.length ;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>=prof){
                    prof = prices[j]-prices[i];
                    flag++;
                }
                                          
            }
        }
        if(flag==0){
            return 0;
        }
        else{
            return prof;
        }
        
    }

}
public class Stock {
	public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of days you want to buy Stock");
        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];
        System.out.println("Enter elements");
        for(int i =0 ;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Solution obj=new Solution();
        int x=obj.maxProfit(arr);
        System.out.println("Profit Amount Would be "+ x);
    }
}
