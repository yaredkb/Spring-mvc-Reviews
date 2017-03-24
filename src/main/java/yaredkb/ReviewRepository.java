package yaredkb;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface ReviewRepository extends CrudRepository<Review, Long> {

	
	
	
	
	List<Review> findByTitle(String Title );
	List<Review> findAll();
	Review findOne(Long id);
	

}
//Set<Review>findAll();