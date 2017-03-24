package yaredkb;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private String content;
	private String imageUrl;
	
	
	public long getId() {
		return id;
	}
	@ManyToOne
	private Category category;
	
	public Review(String title,String imageUrl, String content, Category category){
		this.title=title;
		this.imageUrl =imageUrl;
		this.content=content;
		this.category =category;
				
	}
	
	protected Review(){
		
	}
	public String getTitle() {
		return title;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getContent() {
		return content;
	}
	//@Override
	public Category getCategory(){
		return category;
}
	public void save(Review review) {
		// TODO Auto-generated method stub
		
	}
}
