//write a program to print pattern

import java.io.*;
class Pro5{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Rows Number :");
		int r = Integer.parseInt(br.readLine());

		for(int i=1; i<=r; i++){
			for(int j=1; j<=r; j++){
				if(i%2==0){
					System.out.print("1 ");
				}
				else{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
