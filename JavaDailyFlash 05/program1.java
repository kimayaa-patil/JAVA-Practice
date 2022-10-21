//write a program to calculate area of circle

import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float pi = (float)3.141;

		System.out.println("redius :");
		float r = Float.parseFloat(br.readLine());
		float a = pi*(r*r);

		System.out.println("Area Of Cicle Is : "+a);
	}
}


