package Calculator;

import java.util.Scanner;
public class CalC {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int op=sc.nextInt();
		System.out.println("Enter the operation no.");
		int Operation=sc.nextInt();
		System.out.println("Enter the 1st no.");
		int N1=sc.nextInt();
		System.out.println("Enter the 2nd no.");
		int N2=sc.nextInt();
		
		int Add,Substract,Multiply,Divide;
		
		
			if(op==1) {
				
				if(Operation==1) {
					Add=N1+N2;
					System.out.println(Add);
				}
				else if(Operation==2) {
					Substract=N1-N2;
					System.out.println(Substract);
				}
				else if(Operation==3) {
					Multiply=N1*N2;
					System.out.println(Multiply);
				}
				else if(Operation==4) {
					Divide=N1/N2;
					System.out.println(Divide);
				}
				else
					System.out.println("Syntax Error");
			
				
			}
			else if(op==2) {
				System.out.println("Syntax Error");
				
			}
			
			
		
		
		
		
}
}