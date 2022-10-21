//write a program to calculate Simple Interest. Taking all essential terms to computer as inpute

import java.io.*;
class Pro2{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Principal Amount =");
		float p = Float.parseFloat(br.readLine());

		System.out.println("Rate Of Interest =");
		float r = Float.parseFloat(br.readLine());
                
		System.out.println("Enter Time Period in year");
		System.out.println("Time Period =");
		float t = Float.parseFloat(br.readLine());

		float si = p*r*t/100;

		System.out.println("Simple Interest = "+si);
	}
}

