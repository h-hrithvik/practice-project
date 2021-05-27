/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.Customer;

/**
 * @author lenovo
 *
 */
public interface CustomerInterface {
	
	// Declaration of all services in the interface.
	public Customer[] createCustomer(Customer customer,Customer []customerList,int s);
	
	public void listCustomer(Customer []customerList,int s);
	
	public Customer[] deleteCustomer(int custId, Customer []customerList,int s);
	
	public Customer[] updateCustomer(int custId,Customer cust,Customer []customerList,int s);
	
}
