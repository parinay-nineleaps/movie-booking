package OnlineMovieBookingManagemetSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	@Id
	@Column(name="bookId")
	private long bookId;
	
	public Booking() {
		
	}

	public Booking(long bookId) {
		super();
		this.bookId = bookId;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	
	
	
	
	
	
	
	

}
