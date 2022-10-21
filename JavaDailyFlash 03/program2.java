//writr a program to take a integer raging between 0 to 6 and print corresponding weekday

import java.io.*;
class Pro2{
	public static void main(String[]args)throws IOException{

		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		switch(x){
			case 0 :
				System.out.println("Monday");
				break;
			case 1 :
				System.out.println("Tuesday");
				break;
			case 2 :
				System.out.println("Wednesday");
				break;
			case 3 :
				System.out.println("Thursday");
				break;
			case 4 :
				System.out.println("Friday");
				break;
			case 5 :
				System.out.println("Saturday");
				break;
			case 6 :
				System.out.println("Sunday");
				break;
			default :
				System.out.println("input incorrect");
		}
	}
}
