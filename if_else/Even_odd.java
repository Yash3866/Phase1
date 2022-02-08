package if_else;

import java.util.Scanner;
public class Even_odd {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int N=sc.nextInt();
		if(N%2==0)
			System.out.println("It is a Prime no.");
		else
			System.out.println("It is an odd no");
		
		
		
	}

}
