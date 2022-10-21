//calculate electricity bill
import java.io.*;
class Pro2{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter electricity unit charge");
		int unit = Integer.parseInt(br.readLine());

		float TotalBill = (float)0;

		if(unit <= 50){
			TotalBill = unit*(float)0.50;
			System.out.println(TotalBill);
		}
		else if(unit >= 50 && unit <= 150){
			TotalBill = unit*(float)0.75;
			System.out.println(TotalBill);
		}
		else if(unit >= 150 && unit <= 250){
			TotalBill = unit*(float)1.20;
			System.out.println(TotalBill);
		}
		else if(unit >= 250){
			TotalBill = unit*(float)1.50;
			System.out.println(TotalBill);
		}
	}
}
