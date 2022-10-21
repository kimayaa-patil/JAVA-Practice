//Write a program that takes angles of a triangle from the user and print whether that triangle is valid or not

import java.io.*;
class Pro5{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());

		if(x+y+z==180){
			System.out.println("Tringle is valid");
		}
		else{
			System.out.println("Tringle is invalid");
		}
	}
}
