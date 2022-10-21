//write a Program to take marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate Percentage and grade

import java.io.*;
class Pro5{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("mathematics =");
		int m = Integer.parseInt(br.readLine());

		System.out.println("Physics =");
		int p = Integer.parseInt(br.readLine());

		System.out.println("Chemestry =");
		int c = Integer.parseInt(br.readLine());

		System.out.println("Bio-logy =");
		int b = Integer.parseInt(br.readLine());

		System.out.println("Computer =");
		int co = Integer.parseInt(br.readLine());

		int sum = m+p+c+b+co;
		System.out.println(sum);

		int per = (sum*100)/500;

		if(per<=100 && per>=90){
			System.out.println(per+"% Gread A");
		}
		else if(per<=89 && per>=80){
			System.out.println(per+"% Gread B");
		}
		else if(per<=79 && per>=70){
			System.out.println(per+"% Gread C");
		}
		else if(per<=69 && per>=60){
			System.out.println(per+"% Gread D");
		}
		else if(per<=59 && per>=40){
			System.out.println(per+"% Gread E");
		}
		else if(per<=39){
			System.out.println(per+"% Gread F");
		}
	}
}
