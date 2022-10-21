//pint Pattern

import java.io.*;
class Pro5{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Rows no. :");
		int r = Integer.parseInt(br.readLine());
		
		int x=0;
		for(int i=0; i<r; i++){
			for(int j=0; j<=i; j++){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
}
