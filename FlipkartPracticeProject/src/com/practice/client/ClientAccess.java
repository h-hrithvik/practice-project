/**
 * 
 */
package com.practice.client;

import com.practice.abstractaccess.DemoAccess;

/**
 * @author hp
 *
 */
public class ClientAccess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAccess obj = new DemoAccess();
		System.out.println(obj.testAbstract()); 
		System.out.println(obj.testAccess());

	}
}