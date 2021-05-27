/**
 * 
 */
package com.flipkart.exception;

/**
 * @author hp
 *
 */
public class DemoException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,b=5,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("It is not possible to divide by zero "+ex.getMessage());
		}
		finally {
			//we can close the connection object ,prepaid statement objects , custom objects.
			System.out.println("Program ends.");
		}
	}

}
