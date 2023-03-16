package OnlineMovieBookingManagemetSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="showtiming")
public class Showtime {
	@Column(name="date")
	private String date;
	
	@Column(name="timing")
	private String time;
	
	public Showtime(){
		
	}

	public Showtime(String date, String time) {
		super();
		this.date = date;
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	

}
