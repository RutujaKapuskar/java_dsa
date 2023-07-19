class Pattern{
	public static void main(String[] args){
		int N=4;
		int a;
		int temp =1;
		for(int i =1;i<=N ;i++){
			a =temp;
			for(int j=1;j<=N-i+1;j++){
			
				System.out.print(a++ + " ");
				temp= a-1;	
			}
			

			System.out.println();
		}
	}
}

