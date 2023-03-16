package OnlineMovieBookingManagemetSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	@Column(name="ticketId")
	private long ticketId;
	
	
	

}
