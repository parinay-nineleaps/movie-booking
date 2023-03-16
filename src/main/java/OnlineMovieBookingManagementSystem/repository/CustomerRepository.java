package OnlineMovieBookingManagementSystem.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import OnlineMovieBookingManagemetSystem.entity.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	List<Customer> findByCustomerName(String custName);

	

}
