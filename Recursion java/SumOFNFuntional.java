import java.util.*;
class SumOFNFuntional {
    
    public static int Num(int i){
        
        if(i == 0){
            return 0 ;
        }
        
        return i+Num(i-1);
       
        
 }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of element : ");
        int i=sc.nextInt();
        System.out.println(Num(i));
    }
}
