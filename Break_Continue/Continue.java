class Continue{
	public static void main(String[] args){
		
		int N=10;
		for (int i =1 ;i<=10;i++){
			if(N%3==10){
				continue;
			}
			System.out.println(i);
		}
	}
}

