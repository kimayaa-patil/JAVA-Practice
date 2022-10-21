//Accept two integers from the user and sign of operation also to perform operations

import java.io.*;
class Pro4{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter First Number : ");
		int x = Integer.parseInt(br.readLine());

		System.out.print("Enter Second Number : ");
		int y = Integer.parseInt(br.readLine());

		System.out.print("Enter The Sign of Operation : ");
		char ch = (char)br.read();

		if(ch == '+'){
			System.out.println("Addition of "+x+" And "+y+" is "+(x+y));
		}
		else if(ch == '-'){
			System.out.println("Subtraction of "+x+" And "+y+" is "+(x-y));
		}
		else if(ch == '*'){
			System.out.println("Multiplication of "+x+" And "+y+" is "+(x*y));
		}
		else if(ch == '/'){
			System.out.println("Divition of "+x+" And "+y+" is "+((double)x/y));
		}
	}
}
