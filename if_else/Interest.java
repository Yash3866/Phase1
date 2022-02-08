package if_else;

import java.util.Scanner;
public class Interest {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle Amount,Rate and Years");
		int P=sc.nextInt();
		float R=sc.nextFloat();
		float T=sc.nextFloat();
		
		float I=(P*R*T)/100;
		System.out.println("Interest="+I);
		
		
}
	}