package Looping;

import java.util.Scanner;
public class Natural {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int N=sc.nextInt();
		for(int i=1;i<=N;i++)
			System.out.println(i);
			

}
}