//Series of odd numbers ranging between two numbers entered by the user

import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Min of Series : ");
		int start = Integer.parseInt(br.readLine());

		System.out.print("Max of Series : ");
		int end = Integer.parseInt(br.readLine());
		
		int range;
		int i;
		System.out.print("Series of Odd Numbers Ranging between "+start+" And "+end+" is : ");
		for(i=start; i<=end; i++){
			if(i%2!=0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
