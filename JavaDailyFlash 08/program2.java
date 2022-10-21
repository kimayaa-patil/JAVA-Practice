//Cube of Numbers

import java.io.*;
class Pro2{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range :");
		int r = Integer.parseInt(br.readLine());

		for(int i=1; i<=r; i++){
			System.out.println("Cube of "+i+" : "+i*i*i);
		}
	}
}
