package OnlineMovieBookingManagementSystem.controller;

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

	@PostMapping("/insertcustomer")
	public String insertCustomer(@RequestBody Customer newCustomer) {
		custService.insertCustomer(newCustomer);
		return "Customer added successfully!!";
	}	
		@DeleteMapping("/deletecustomer/{cusid}")
		public void deleteCustomer( @PathVariable ("cusid")Long custid ){
			custService.deleteCustomer(custid);
		}
		
		@GetMapping("/getallcustomers")
		public List<Customer>getAllcustomer(){
			return custService.getAllCustomer();
		}
		
		@PutMapping("/updatecustomer/{custid}")
		public Customer updateCustomer(@PathVariable("custid")Long custId,@RequestBody Customer updatedCustomer) {
			@SuppressWarnings("unused")
			Customer updatedCustomer1 = null;
			return custService.updateCustomer( custId, updatedCustomer);
		}
		
		@GetMapping("/getcustomerbyid/{cusid}")
		public Customer getCustomerById(@PathVariable("custid")Long custId) {
			return custService.getCustomerById(custId);
		}
		
		@GetMapping("/getcustomerbyname/{empname}")
		public List<Customer>findByCustomerName(@PathVariable ("custname")String custName){
			return custService.findByCustomerName(custName);
		}
	}

