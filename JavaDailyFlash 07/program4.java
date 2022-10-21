//print the sum and average of entered number

import java.io.*;
class Pro4{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a Rang :");
		int r = Integer.parseInt(br.readLine());
		
		int sum=0;
		for(int i=1; i<=r; i++){
			sum = sum+i;
		}

		System.out.println("Sum of "+r+" entered Numbers is :"+sum);
		float avg = (float)sum/r;
		System.out.println("Average of "+r+" entered Number is :"+avg);
	}
}
