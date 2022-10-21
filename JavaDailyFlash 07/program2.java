//print sum of all number up to the entered number

import java.io.*;
class Pro2{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter Range :");
		int r = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i=1; i<=r; i++){
			sum = sum+i;
		}
		System.out.println("The sum of numbers up to "+r+" is "+sum);
	}
}
