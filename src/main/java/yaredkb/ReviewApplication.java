package yaredkb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ReviewApplication { 

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}
	}
//	@Resource
//	private ReviewRepository reviewRepository;
//	
//	@Bean
//	public CommandLineRunner populateReviews(){
//		return new ReviewPopulator();
//	} 
//	private class ReviewPopulator implements CommandLineRunner{
//		@Override
//		public void run(String...args) throws Exception{
//			
//		}
//	}
//	
//	@Resource
//	private CategoryRepository categoryRepository;
//	   
//	    }
