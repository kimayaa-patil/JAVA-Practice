//Write a Program to Print Odd Numbers
import java.io.*;
class Pro3{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Range for Odd Numbers : ");
		int r = Integer.parseInt(br.readLine());

		for(int i=1; i<=r; i=i+2){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

