//print their place of service

import java.io.*;
class Pro3{
	public static void main(String[]args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Age :");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Gender :");
		char g = (char)br.read();
		br.skip(1);

		System.out.println("marital status :");
		char ms = (char)br.read();
		br.skip(1);

		if(g == 'F'){
			System.out.println("she will work only in urban areas");
		}
		else if(g == 'M' && age>20 && age<=40){
			System.out.println("he may work in anywhere");
		}
		else if(g == 'M' && age>40 && age<=60){
			System.out.println("he will work in urban areas only");
		}
		else{
			System.out.println("ERROR");
		}
	}
}
