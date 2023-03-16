package OnlineMovieBookingManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository(Movie,Long) {

}
