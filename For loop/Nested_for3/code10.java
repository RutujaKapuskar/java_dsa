class Pattern{

	/* 1 2 3 4
	 * 4 5 6
	 * 6 7
	 * 7
	  */


	public static void main(String[] args){

		int num=4;
		int temp=1;

		for(int p=1 ; p<=num;p++){

			for(int q=1;q<=num-1+p; q++){

				System.out.print(temp++ +" ")
