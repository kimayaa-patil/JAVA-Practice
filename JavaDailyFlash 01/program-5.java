import java.io.*;
class Pro5{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number");

		int x = Integer.parseInt(br.readLine());

		if(x%5==0 && x%11==0){
			System.out.println(x+" is devided by 5 and 11");
		}
		else{
			System.out.println(x+" is not devided by 5 and 11");
		}
	}
}

