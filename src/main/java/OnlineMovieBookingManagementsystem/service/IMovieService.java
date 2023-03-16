package OnlineMovieBookingManagementsystem.service;

import java.util.List;

import OnlineMovieBookingManagemetSystem.entity.Customer;
import OnlineMovieBookingManagemetSystem.entity.Movie;

public interface IMovieService {

	void insertmovie(Movie newMovie);

	void deleteMovie(Long movieid);

	List<Customer> getAllMovie();

	Movie updateMovie(Long movId, Movie updatedMovie);

}
