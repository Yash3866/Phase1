package if_else;

import java.util.Scanner;

public class Demo {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st no.");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd no.");
		int b=sc.nextInt();
	
		if(a>b)
			System.out.println("1st no. is greater");
		else
			System.out.println("2nd no. is greater");
		
		
		
		
	}
}
