//Addition and Subtraction of Numbers

import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter two Numbers :");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		System.out.println("Addition is "+(x+y));
		if((x-y) < 0){
			System.out.println("Subtraction is "+(x-y)*(-1));
		}
		else{
			System.out.println("Subtraction is "+(x-y));
		}
	}
}
