package yaredkb;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	//@ManyToOne
	@OneToMany(mappedBy="category",fetch=FetchType.EAGER)
	private Collection<Review> reviews;

	public String getTitle() {
		return title;
	}
	protected Category(){
		
	}
public Category(String categoryTitle,Collection<Review>reviews){
	this.title=categoryTitle;
	this.reviews=reviews;
}
	@Override
	public String toString(){
		return String.format("Category [id=%d,title='%s']", id, title);
	}
	public Long getId() {
		return id;
	}
}
