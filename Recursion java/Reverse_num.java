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
        Num(1,5);
    }
}
