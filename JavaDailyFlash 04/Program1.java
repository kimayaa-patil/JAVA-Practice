//Write a Program to take all three sides of a tringle from the user and check whether the tringlr satisfies the Pythagoream Theorem

import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
		System.out.println("Side 1 = ");
		int a = Integer.parseInt(br.readLine());

		System.out.println("Side 2 = ");
		int b = Integer.parseInt(br.readLine());

		System.out.println("Hypotenuse = ");
		int c = Integer.parseInt(br.readLine());

		if((a*a)+(b*b)==(c*c)){
			System.out.println("Tringle Satisfies the Pythagorean Theorem");
		}
		else{
			System.out.println("Tringle not Satisfies the Pythagorean Theorem");
		}
	}
}
