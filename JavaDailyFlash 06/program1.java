//Write a Progrm to Print Natural Numbers

import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Range :");
		int r = Integer.parseInt(br.readLine());

		for(int i=1; i<=r; i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
