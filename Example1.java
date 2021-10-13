package javaday10;

public class Example1 {
	public static void main(String[] args) {
		
			int a=2;
			int b=0;
			
			try
			{
			int c =a/b;
		    }
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("a");
			}
			
			catch(ArithmeticException e1)
			{
				System.out.println(e1);
			}
			
	}


}