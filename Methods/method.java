package Methods;

public class method {
	
	 int square(int num){
	   return num * num; 
	 }
	 String name(String s) {
		 
		 return s;
	 }
	public static void main(String[] args) 
	{
	
	  method t = new method();
	  method t1 = new method();
	  
	
	   int squareOfNumber = t.square(20); 
	 
	  
	   System.out.println("Square of 20: " +squareOfNumber);
	   
	   String nameOfPerson =t1.name("Yash Pandey");
	   System.out.println("name of person " +nameOfPerson);
	  }
	}

