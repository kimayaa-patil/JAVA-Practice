//Write a Program to check whether the character is Uppercase or LowerCase Charecter

import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch = (char)br.read();

		if(ch>='A' && ch<='Z'){
			System.out.println("letter "+ch+" is in Uppercase");
		}
		else if(ch>='a' && ch<='z'){
			System.out.println("letter "+ch+" is in Lowercase");
		}
	}
}
