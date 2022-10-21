//ASCII vailu
import java.io.*;
class Pro5{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter charectar :");
		char ch = (char)br.read();

		System.out.println("ASCII value of "+ch+" is");
		System.out.println(+ch);
	}
}
