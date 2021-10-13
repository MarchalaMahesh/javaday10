package javaday10;

public class Example2 {
	public static void main(String[] args) {
    try {
		test();
	} 
    catch (ArithmeticException e)
    {
    	System.out.println("exception is handled by the main method");
		
	}
	}
	public static void test()
	{
		int c=10/0;
	}

}
