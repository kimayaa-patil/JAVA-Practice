//write a Program to print folowing pattern

import java.io.*;
class Pro4{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the no. of rows");
		int n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++){
			int x = 1;
			for(int j=0; j<n; j++){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
}

