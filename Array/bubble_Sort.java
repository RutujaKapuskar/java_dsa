//sorting an array using bubble sort in java
import java.util.*;
class Main {
    public static void bubble_Sort(int arr[],int n){
            for(int i=n-1;i>=0;i--){
                
                for(int j=0;j<=i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }
            } System.out.println(Arrays.toString(arr));    
        
        }
       

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble_Sort(arr,n);
        
    }
}
