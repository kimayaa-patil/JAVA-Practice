//Print table of that given Number

import java.io.*;
class Pro4{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number :");
		int n = Integer.parseInt(br.readLine());

		for(int i=1; i<=10; i++){
			System.out.print(i*n+" ");
		}
		System.out.println();
	}
}
