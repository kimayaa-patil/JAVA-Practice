import java.io.*;
class Pro2{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number");

		int x = Integer.parseInt(br.readLine());

		if(x > 0){
			System.out.println(x+" is positive number");
		}
		else if(x < 0){
			System.out.println(x+" is negative number");
		}
		else{
			System.out.println(x+" is zero");
		}
	}
}
