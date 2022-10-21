//Write a Program to check whether the Charector is Alphabet or not

import java.io.*;
class Pro2{
	public static void main(String[]args)throws IOException{

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the charector");
		char ch = (char)br.read();
                
		//check whether the charector is alphabet or not
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			System.out.println(ch+" is an alphabet");
		}
		else{
			System.out.println(ch+" is a not alphabet");
		}
	}
}	
