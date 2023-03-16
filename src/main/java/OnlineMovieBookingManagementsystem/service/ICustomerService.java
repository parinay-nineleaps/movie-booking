package OnlineMovieBookingManagementsystem.service;

import java.util.List;

import OnlineMovieBookingManagemetSystem.entity.Customer;


public interface ICustomerService {
	public List<Customer> getAllCustomer();
	public Customer getCustomerById(Long custId);
	public Customer insertCustomer(Customer newCustomer);
	public void deleteCustomer(Long custId);
	public Customer updateCustomer(Long custId, Customer updatedCustomer);
	
	public List<Customer> findByCustomerName(String custName);

}
