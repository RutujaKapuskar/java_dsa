class prime{
	public static void main(String[] args){

		int N=15;
		int count = 0 ;
		
		for(int i =1 ;i<=10;i++){
			if(N%10==0){
				count++;
			}
			if(count>2){
				break;
			}
		}
		if(count ==2)
		{
			System.out.println("Given Number is prime number");
		}
		else
			System.out.println("Not a prime number");
	}
}
