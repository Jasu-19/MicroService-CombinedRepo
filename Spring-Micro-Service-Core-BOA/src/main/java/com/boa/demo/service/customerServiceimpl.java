package com.boa.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boa.demo.bean.Customer;

@Service
public class customerServiceimpl implements customerService{
	private List<Customer> customerlist = new ArrayList<>();

	@Override
	public void createCustomer(int id, String name, String address) {
		Customer customer = new Customer(id, name, address);
		customerlist.add(customer);
		System.out.println( "Customer Created");
	}

	@Override
	public void updateCustomer(int id, String  newname , String newaddress) {
		// TODO Auto-generated method stub
		for(Customer customer : customerlist)
		{
			if(customer.getCustomerId()==id)
			{
				customer.setCustomerName(newname);
				customer.setCustomerAddress(newaddress);
			}
		}
		System.out.println( "Updated");
		
	}
	
	//to delete customer 
	//id-1 because even id is int it starts with 1 but arraylist start from 0;
	@Override
	public void deleteCustomer(int id) {
		
		customerlist.remove(id-1);
		System.out.println( "Deleted");
		
	}

	//to return particular customer by id
	@Override
	public void ListCustomer(int id) {
		for(Customer customer : customerlist)
		{
			if(customer.getCustomerId()==id)
			{
				System.out.println("CustomerId : "+customer.getCustomerId());
				System.out.println("CustomerName : "+customer.getCustomerName());
				System.out.println("CustomerAddress : "+customer.getCustomerAddress());
			}
		
	}
	

	}

	//to return all the customers
	@Override
	public void ListAllCustomer() {
		// TODO Auto-generated method stub
		for(Customer customer: customerlist)
		{
			System.out.println("CustomerId : "+customer.getCustomerId());
			System.out.println("CustomerName : "+customer.getCustomerName());
			System.out.println("CustomerAddress : "+customer.getCustomerAddress());
		}	
		
	}
}
