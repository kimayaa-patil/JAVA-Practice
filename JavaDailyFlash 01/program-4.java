import java.io.*;
class Pro4{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		for(int i=1; i<=x; i++){
			for(int j=1; j<=x; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
