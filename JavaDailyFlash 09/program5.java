//Print pattern

import java.io.*;
class Pro5{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Rows No. :");
		int r = Integer.parseInt(br.readLine());

		for(int i=0; i<r; i++){
			for(int j=0; j<=i; j++){
				if(i%2==0){
					System.out.print("* ");
				}
				else{
					System.out.print("$ ");
				}
			}
			System.out.println();
		}
	}
}
