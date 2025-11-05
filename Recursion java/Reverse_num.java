import java.util.*;
class Main {
    
    public static void Num(int i ,int n){
        if(i>n){
            return;
        }
        Num(i+1,n);
        System.out.print(i + " ");
        
            
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter start element :");
        int i=sc.nextInt();
        System.out.println("Enter End Element : ");
        int n=sc.nextInt();
        Num(i,n);
    }
}
