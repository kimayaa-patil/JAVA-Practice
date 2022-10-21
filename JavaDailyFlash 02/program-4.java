//write a Program to print following Pattern 

import java.io.*;
class Pro4{
	public static void main(String[]args)throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		char ch = (char)br.read();

		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}

