package OnlineMovieBookingManagemetSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="theater")
public class Theater {
	@Column(name="theatername")
	private String location;
	
	@Column(name="contact")
	private String contact;
	
	public Theater() {
		
	}

	public Theater(String location, String contact) {
		super();
		this.location = location;
		this.contact = contact;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	

}
