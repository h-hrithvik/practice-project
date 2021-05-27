/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.Customer;

/**
 * @author lenovo
 *
 */
public class CustomerImpl implements CustomerInterface {

	@Override
	public Customer[] createCustomer(Customer customer, Customer []customerList,int s) {
		// TODO Auto-generated method stub
		customerList[s]=customer;
		s++;
		return customerList;
	}

	@Override
	public void listCustomer( Customer []customerList,int s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s;i++) {
			System.out.println(customerList[i].getCustId() + " "+customerList[i].getCustName()+ " "+customerList[i].getCustAddress());
		}
	}

	@Override
	public Customer[] deleteCustomer(int custId, Customer []customerList,int s) {
		// TODO Auto-generated method stub
		
		int index=-1;
		for(int i=0;i<s;i++) {
			if(customerList[i].getCustId() == custId) {
				index = i;
				break;
			}
		}
		if( index == -1) {
			System.out.println("No such customer exists!");
			return customerList;
		}
		for(int i=index;i<(s-1);i++)
		{
			customerList[i]=customerList[i+1];
		}
		s--;
		return customerList;
	}

	@Override
	public Customer[] updateCustomer(int custId, Customer cust, Customer []customerList,int s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s;i++)
		{
			if(customerList[i].getCustId()==custId)
			{
				customerList[i].setCustName(cust.getCustName());
				customerList[i].setCustAddress(cust.getCustAddress());
				return customerList;
			}
			
		}
		return customerList;
		
	}

	
	

}
