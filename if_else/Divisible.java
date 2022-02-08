package if_else;

import java.util.Scanner;
public class Divisible {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=sc.nextInt();
		if(n%5==0)
			System.out.println("No. is divisible by 5");
		else
			System.out.println("NOT");
			
		
	}

}
