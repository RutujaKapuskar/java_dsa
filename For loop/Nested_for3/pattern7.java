class Pattern{
	public static void main(String[] args){
		int N=6;
		char ch ='F';
		char temp = ch;
		for(int i =1;i<=N ;i++){
			ch=temp--;
			for(int j=1;j<=i;j++){

				System.out.print(ch++ + " ");
				
			
			}
		

			
			System.out.println();
		}
	}
}

