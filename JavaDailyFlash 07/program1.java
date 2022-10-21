//write a program that accepts an integer from the user and print it

import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a Number");
		int x = Integer.parseInt(br.readLine());

		System.out.println(x);
	}
}
