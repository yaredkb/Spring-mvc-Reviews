package yaredkb;


import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	//Object allCategories();
	/*
	Set<Category>findAll();
	Category findOne(Long id);

	List<Category> findByTitle(String categoryTitle);
*/

//	List<Category> findOne();
}
