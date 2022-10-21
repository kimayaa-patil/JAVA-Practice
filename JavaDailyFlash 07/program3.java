//Print whether that number is odd or even

import java.io.*;
class Pro3{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a Number :");
		int n = Integer.parseInt(br.readLine());

		if(n%2==0){
			System.out.println(n+" is an Even Number");
		}
		else{
			System.out.println(n+" is a Odd Number");
		}
	}
}
