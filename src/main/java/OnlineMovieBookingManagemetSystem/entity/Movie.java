package OnlineMovieBookingManagemetSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	@Id
	@Column(name="movieId")
	private long movieId;
	@Column(name="movieName")
	private String movieName;
	@Column(name="movieCategory")
	private String movieCategory;
	
	public Movie() {
		
	}

	public Movie(long movieId, String movieName, String movieCategory) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieCategory = movieCategory;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieCategory() {
		return movieCategory;
	}

	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}
	

}
