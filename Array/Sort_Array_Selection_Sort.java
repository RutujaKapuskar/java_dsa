//Sorting Array using Selectio sort
import java.util.*;
class Main {
    public static void selection_Sort(int arr[],int n){
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selection_Sort(arr,n);
        
    }
}
