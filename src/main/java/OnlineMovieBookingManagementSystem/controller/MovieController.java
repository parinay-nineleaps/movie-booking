package OnlineMovieBookingManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import OnlineMovieBookingManagementsystem.service.IMovieService;
import OnlineMovieBookingManagemetSystem.entity.Customer;
import OnlineMovieBookingManagemetSystem.entity.Movie;

@RestController
public class MovieController {
	@Autowired
	private IMovieService movService;
	@PostMapping("/insertmovie")
	public String insertMovie(@RequestBody Movie newMovie) {
		movService.insertmovie(newMovie);
		return "Movie added successfully!!";
	}
	
	@DeleteMapping("/deletemovie/{movid}")
	public void deleteCustomer( @PathVariable ("movieid")Long movieid ){
		movService.deleteMovie(movieid);
	}
	@GetMapping("/getallcustomers")
	public List<Customer>getAllcustomer(){
		return movService.getAllMovie();
	}
	@PutMapping("/updatemovie/{movid}")
	public Movie updateMovie(@PathVariable("movid")Long movId,@RequestBody Movie updatedMovie) {
		@SuppressWarnings("unused")
		Movie updatedMovie = null;
		return movService.updateMovie( movId, updatedMovie);
	}
	
	
	
	
	

}
