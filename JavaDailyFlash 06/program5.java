//Write a Program to Print Following Pattern
import java.io.*;
class Pro5{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Rows No.");
		int r = Integer.parseInt(br.readLine());

		for(int i=0; i<=r; i++){
			for(int j=0; j<=r; j++){
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
