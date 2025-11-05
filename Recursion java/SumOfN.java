import java.util.*;
class SumOfN {
    
    public static void Num(int i ,int sum){
        
        if(i<1){
            System.out.println(sum);
            return ;
        }
        
        Num(i-1,sum+i);
       
        
 }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of element : ");
        int i=sc.nextInt();
        Num(i,0);
    }
}
