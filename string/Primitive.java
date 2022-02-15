package string;

import java.util.Scanner;

public class Primitive {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
	
		int i=Integer.parseInt(s);
		System.out.println("Enter the String in intger"+i);
		long L=Long.parseLong(s);
		System.out.println("Enter the String in long"+L);
		float F=Float.parseFloat(s);
		System.out.println("Enter the String in float"+F);
		char C=s.charAt(1);
		System.out.println("Enter the String character"+C);
	
		
	
		
	}

}
