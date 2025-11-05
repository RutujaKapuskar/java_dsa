class Name {
    public void name(int i){
        
        if(i>5){
            return;
        }
        i++;
        System.out.println("Rutuja");
        name(i);
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Name obj =new Name();
        obj.name(1);
    }
}
