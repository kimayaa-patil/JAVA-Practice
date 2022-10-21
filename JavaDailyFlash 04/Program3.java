//write a Program to check if a year is leap year or not

import java.io.*;
class Pro3{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the year");
		int y = Integer.parseInt(br.readLine());

		if(y%4==0){
			System.out.println(y+" is a leap year");
		}
		else{
			System.out.println(y+" is not a leap year");
		}
	}
}
