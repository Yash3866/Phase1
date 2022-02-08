package if_else;

import java.util.Scanner;

public class Percentage {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Percentage");
		int P=sc.nextInt();
		if(P>=70 && P<=100)
			System.out.println("Distinction");
		else if(P>=60 && P<=69)
			System.out.println("First Division");
		else if(P>=50 && P<=59)
			System.out.println("2nd Division");
		else if(P>=35 && P<=49)
			System.out.println("Passed");
		else if(P>=0 && P<=34)
			System.out.println("Fail");
		else
			System.out.println("Enter the correct percentage");
			
				
}
}