package com.nineleaps.OnlineMovieBookingManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import OnlineMovieBookingManagementsystem.service.ICustomerService;
import OnlineMovieBookingManagemetSystem.entity.Customer;

@RestController
public class CustomerController {
	@Autowired
	private ICustomerService custService;
	@GetMapping
	public List<Customer> getAllCustomer(){
		return custService.getAllCustomer();
	}
	@GetMapping("/getcustomerbyid/{cusid}")
	public Customer getcustomerById(@PathVariable("cusid") Long custId) {
	return custService.getCustomerById(custId);
	}
	@PostMapping("/insertcustomer")
	public String insertCustomer(@RequestBody Customer newCustomer)
	{
		custService.insertCustomer(newCustomer);
		return "Customer Added successfully";
	}
	@DeleteMapping("/deletecustomer/{cusid}")
	public String deleteCustomer(@PathVariable("cusid") Long custId) {
		custService.deleteCustomer(custId);
		return "customer deleted successfully";
	}
	@PutMapping("/updatecustomer/{cusid}")
	public String updatecustomer(@RequestBody Customer updatedCustomer,@PathVariable("cusid") Long custId) {
		custService.updateCustomer(custId,updatedCustomer);
		return "customer updated successfully";
	}
}
	
	
	
