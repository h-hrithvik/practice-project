package com.practice.abstractaccess;

public class DemoAccess extends DemoAbstract {
	
	public String testAbstract() {
		return "Child class implementation of Parent.";
	}

	public String testAccess() {
		return "Access Demo method.";
	}

}