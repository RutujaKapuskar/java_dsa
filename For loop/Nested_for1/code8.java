import java.io.*;

class Pattern{

	public static void main(String[]  ags)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the row:");
		int row=Integer.parseInt(br.readLine());
		//int col=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=row;i++){
			char ch ='C';
			for(int j=1;j<=row;j++){
				System.out.print( ch-- + "  " );
			}
			
		
		System.out.println();
		}





	}}
