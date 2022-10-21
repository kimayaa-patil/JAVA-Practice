//write a progarm to take the number of months and print the number of the day in that month

import java.io.*;
class Pro3{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the year");
		int y = Integer.parseInt(br.readLine());
                
		System.out.println("enter the month");
		int x = Integer.parseInt(br.readLine());

		switch(x){
			case 1 :
				System.out.println("January is a 31 days month");
				break;
			case 2 :
				if(y % 4 == 0){
					System.out.println("February is a 29 days month");
				}
				else{
					System.out.println("February is a 28 days month");
				}
				break;
			case 3 :
				System.out.println("March is a 31 days month");
				break;
			case 4 :
				System.out.println("April is a 30 days month");
				break;
			case 5 :
				System.out.println("May is a 31 days month");
				break;
			case 6 :
				System.out.println("june is a 30 days month");
				break;
			case 7 :
				System.out.println("july is a 31 days month");
				break;
			case 8 :
				System.out.println("Augest is a 31 days month");
				break;
			case 9 :
				System.out.println("September is a 30 days month");
				break;
			case 10 :
				System.out.println("October is a 31 days month");
				break;
			case 11 :
				System.out.println("November is a 30 days month");
				break;
			case 12 :
				System.out.println("December is a 31 days month");
				break;
			default :
				System.out.println("Invalide Inpute");
				break;
		}
	}
}
