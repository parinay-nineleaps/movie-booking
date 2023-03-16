package OnlineMovieBookingManagemetSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="custId")
	private long customerId;
	
	@Column(name="custName")
	private String customerName;
	
	@Column(name="custEmail")
	private String customerEmail;
	
	@Column(name="custMobNo")
	private String customerMobNo;
	public Customer()
	{
		
	}
	public Customer(long customerId, String customerName, String customerEmail, String customerMobNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerMobNo = customerMobNo;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerMobNo() {
		return customerMobNo;
	}
	public void setCustomerMobNo(String customerMobNo) {
		this.customerMobNo = customerMobNo;
	}
	
	
	

}
