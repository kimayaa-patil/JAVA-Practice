//Addition of their Cubes And Subtraction of their Squares

import java.io.*;
class Pro3{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two Numbers :");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		int cube1 = x*x*x;
		int cube2 = y*y*y;
		int add = cube1+cube2;

		int squ1 = x*x;
		int squ2 = y*y;
		int sub = squ1-squ2;

		System.out.println("Addition of "+cube1+" And "+cube2+" is "+add);
		System.out.println("Subtraction of "+squ1+" And "+squ2+" is "+sub);
	}
}
