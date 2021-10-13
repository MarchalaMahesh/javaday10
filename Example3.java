package javaday10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example3 {
	public static void main(String[] args)  
	
	{
		test();
	}
	public static void test() throws FileNotFoundException
	{
		new FileOutputStream("d");
	}

}
