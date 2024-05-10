package com.boa.demo.service;

public interface customerService {
	
	public void createCustomer(int id, String name, String address);
	public void updateCustomer(int id, String name, String address);
	public void ListCustomer(int id);
	public void ListAllCustomer();
	public void deleteCustomer(int id);


}
