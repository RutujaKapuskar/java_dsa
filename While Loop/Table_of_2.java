import java.io.*;

class While_Demo{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int i =1 ;
		System.out.print("Enter the number: ");

		int num= Integer.parseInt(br.readLine());

		while(i<=10){
			System.out.println(i +"X" +num +"="+ i*num);
			
			i++;
		}
	}
}

		

