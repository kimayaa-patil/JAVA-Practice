//

import java.io.*;
class Pro5{
	public static void main(String[]args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no1 = Integer.parseInt(br.readLine());
		int no2 = Integer.parseInt(br.readLine());
		int no3 = Integer.parseInt(br.readLine());

		if(no1>no2 && no1>no3){
			System.out.println(no1+" is Max number among "+no1+" "+no2+", "+no3);
		}
		else if(no2>no1 && no2>no3){
			System.out.println(no2+" is Max number among "+no1+" "+ no2+", "+no3);
		}
		else{
			System.out.println(no3+" is Max number among "+no1+" "+ no2+", "+no3);
		}
	}
}
