import java.io.*;
class Pro1{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the numbers");

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if(x > y){
			System.out.println(x+" is the max number among "+x+" and "+y);
		}
		else{
			System.out.println(y+" is the max number among "+x+" and "+y);
		}
	}
}
