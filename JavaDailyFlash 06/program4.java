//Write a Program to Print Even Numbers

import java.io.*;
class Pro4{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Range for Even Numbers :");
		int r  = Integer.parseInt(br.readLine());

		for(int i=2; i<=r; i=i+2){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
