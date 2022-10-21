//Write a Program to Print Sum Of Natural Numbers

import java.io.*;
class Pro2{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Range for sum :");
		int r = Integer.parseInt(br.readLine());
		int sum = 0;

		for(int i=1; i<=r; i++){
			sum = sum+i;
		}
		System.out.println("Sum of First "+r+" Natural Numbers : "+sum);
	}
}
