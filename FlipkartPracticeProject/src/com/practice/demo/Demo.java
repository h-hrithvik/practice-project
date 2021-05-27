/**
 * 
 */
package com.practice.demo;

import com.practice.demo2.BusinessCalc;

/**
 * @author hp
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *  syso then ctrl + space
		 */
		System.out.println("demo java program");
		BusinessCalc calc= new BusinessCalc();
		System.out.println("addition: "+calc.add(10, 10));
		System.out.println("subtraction: "+calc.sub(10, 10));
		System.out.println("multiplication: "+calc.mul(10, 10));
		System.out.println("division: "+calc.div(10, 10));
		System.out.println("static calling: "+BusinessCalc.teststatic("hello"));
		Cclass c = new Cclass();
		Aclass a = new Aclass();
		Bclass b = new Bclass();
		Dclass d = new Dclass();
		System.out.println("Class A add: "+a.add(10,5));
		System.out.println("Class B add: "+b.add(10,5));
		System.out.println("Class B sub: "+b.sub(10,5));
		System.out.println("Class C add: "+c.add(10,5));
		System.out.println("Class C sub: "+c.sub(10,5));
		System.out.println("Class C mul: "+c.mul(10,5));
		System.out.println("Class D add: "+d.add(10,5));
		System.out.println("Class D div: "+d.div(10, 5));
		//final class : can't extend it
		//final method : can't override it
		//final variable : constant value
	}

}
