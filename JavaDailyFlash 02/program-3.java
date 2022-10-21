//write a program to find whether the character is an alphabet, a digit or a special charecter

import java.io.*;
class Pro3{
	public static void main(String[]args)throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the charecter");
		char ch = (char)br.read();

		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			System.out.println(ch+" is a alphabet");
		}
		else if(ch>=48 && ch<=57){
			System.out.println(ch+" is a digit");
		}
		else{
			System.out.println(ch+" is a Special Charecter");
		}
	}
}
