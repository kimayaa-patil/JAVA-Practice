import java.io.*;
class Pro3{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number");

		int x = Integer.parseInt(br.readLine());

		if(x%2==0){
			System.out.println(x+" is an even number!");
		}
		else{
			System.out.println(x+" is a odd number1");
		}
	}
}
