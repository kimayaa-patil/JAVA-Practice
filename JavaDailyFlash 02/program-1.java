//Write a program to check whether the charector is vowel or consonant

import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the charector");
		char ch = (char)br.read();

		//chech whether the charectot is vowel or consonant
		if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
			System.out.println(ch+" is a Vowel");
		}
		else{
			System.out.println(ch+" is a consonant");
		}
	}
}
