package OnlineMovieBookingManagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import OnlineMovieBookingManagementSystem.repository.CustomerRepository;
import OnlineMovieBookingManagemetSystem.entity.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private CustomerRepository custRepository;

	@Override
	public List<Customer> getAllCustomer() {
		return custRepository.findAll();
	}
	@Override

	public Customer getCustomerById(Long custId) {
		
		//select * from employee;
		return custRepository.findById(custId).get();
	}

	@Override
	public Customer updateCustomer(Long custId, Customer updatedCustomer) {
		Customer cust =getCustomerById(custId);
		if(cust!=null) {
			cust.setCustomerName(updatedCustomer.getCustomerName());
			cust.setCustomerEmail(updatedCustomer.getCustomerEmail());
			cust.setCustomerMobNo(updatedCustomer.getCustomerMobNo());
		}
		custRepository.save(cust);
		return cust;
	}

	@Override
	public void deleteCustomer(Long custId) {
		
		//delete from customer where employeeId=?;
		custRepository.deleteById(custId);
		
	}

	@Override
	public Customer insertCustomer(Customer newCustomer) {
		return custRepository.save(newCustomer);
	}
	
	@Override
	public List<Customer>findByCustomerName(String custName){
		return custRepository.findByCustomerName(custName);
	}
	

}



