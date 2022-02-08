package if_else;

import java.util.Scanner;
public class Age {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		
		int a=sc.nextInt();
		
		if(a>18)
			System.out.println("Person is eligible to vote");
		else
			System.out.println("Person is not eligible to vote");
		
		
		
	}

}
