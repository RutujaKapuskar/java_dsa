class Pattern{
	public static void main(String[] args){
		int N=4;
		int a =1;
		for(int i =1;i<=N ;i++){
			for(int j=1;j<=i;j++){
			
				System.out.print(a*a*a + " ");
				a++;

			}

			System.out.println();
		}
	}
}

