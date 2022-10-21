//Multiplication and Division of Two Numbers

import java.io.*;
class Pro2{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two Numbers :");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		System.out.println("Multiplication is "+(x*y));
		
		if(x>y){
			System.out.println("Division is "+((float)x/y));
		}
		else{
			System.out.println("Division is "+((float)y/x));
		}
	}
}
