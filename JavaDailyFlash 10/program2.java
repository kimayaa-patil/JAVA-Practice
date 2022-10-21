//Swaps their insertion order

import java.io.*;
class Pro2{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Numbers :");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		System.out.println("Before Swap : "+x+" "+y);

		int t;
		t=x;
		x=y;
		y=t;

		System.out.println("After Swap : "+x+" "+y);
	}
}

