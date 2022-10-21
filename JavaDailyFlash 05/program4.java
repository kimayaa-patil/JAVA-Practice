//pattern
import java.io.*;
class Pro4{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Rows No. :");
		int x = Integer.parseInt(br.readLine());
		
		for(int i=0; i<x; i++){
			int n=2;
			for(int  j=0; j<x; j++){
				System.out.print(n+" ");
				n=n+2;
			}
			System.out.println();
		}
	}
}
