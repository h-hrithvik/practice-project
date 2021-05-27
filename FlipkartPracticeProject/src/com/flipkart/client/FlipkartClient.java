/**
 * 
 */
package com.flipkart.client;


import java.util.Scanner;

import com.flipkart.bean.Customer;
import com.flipkart.service.CustomerImpl;
import com.flipkart.service.CustomerInterface;

/**
 * @author lenovo
 *
 */
public class FlipkartClient {

	/**
	 * @param args
	 */
	
	CustomerInterface custService = new CustomerImpl();
	int s=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerList[] = new Customer[100];
		int choice=-1;
		FlipkartClient obj=new FlipkartClient();
		Scanner in = new Scanner(System.in);
		try {
		while(choice!=5) {
			System.out.println("######Customer Menu########");
			System.out.println("Press 1 for Creating the Customer");
			System.out.println("Press 2 for Viewing all the customer");
			System.out.println("Press 3 for Deleting the customer.");
			System.out.println("Press 4 for Updating the customer.");
			System.out.println("Press 5 for Exit");
			
			
			choice = in.nextInt();
			//in.nextLine();
			
			switch(choice){
			case 1:	customerList=obj.addCustomer(customerList);	
					break;
			case 2:
					obj.viewCustomerList(customerList);
					break;
			case 3:
					customerList=obj.deleteCustomer(customerList);
					break;
			case 4: customerList=obj.updateCustomer(customerList);
					break;
			case 5: break;
			
			default :
					System.out.println("Enter a valid choice!");
					break;
			}
			
		}
		}
		catch(Exception ex)
		{
			System.out.println("error");
		}
		finally 
		{
			in.close();
		}
		}
	
	private Customer[] addCustomer(Customer []arr) {
		System.out.println("Enter the Id of the customer:");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		in.nextLine();
		System.out.println("Enter the Name of the customer:");
		String name = in.nextLine();
		System.out.println("Enter the Address of the customer:");
		String address = in.nextLine();
		Customer cust = new Customer(id,name,address);
		//in.close();
		//System.out.println(cust.getCustId()+cust.getCustName()+cust.getCustAddress());
		return custService.createCustomer(cust, arr,s++);
		
	}
	
	private void viewCustomerList(Customer []arr) {
		custService.listCustomer(arr,s);
	}
	
	private Customer[] deleteCustomer(Customer []arr) {
		System.out.println("Enter a valid customerId which you want to delete?");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		in.nextLine();
		//in.close();
		return custService.deleteCustomer(id, arr,s--);
		
	}
	
	private Customer[] updateCustomer(Customer []arr) {
		System.out.println("Enter the a valid Id of the customer you want to update:");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		in.nextLine();
		System.out.println("Enter the updated Name of the customer:");
		String name =  in.nextLine(); 
		System.out.println("Enter the updated Address of the customer:");
		String address = in.nextLine();
		//in.close();
		Customer cust = new Customer(id,name,address);
		return custService.updateCustomer(id, cust, arr,s);
		
	}

}

