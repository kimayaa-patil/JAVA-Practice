//write a Program to print following patterm

import java.io.*;
class Pro4{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the rows no.");
		int x = Integer.parseInt(br.readLine());
                
		int n = 1;
		for(int i=0; i<x; i++){
			for(int j=0; j<x; j++){
				System.out.print(n+"     ");
				n++;
			}
			System.out.println();
		}
	}
}
