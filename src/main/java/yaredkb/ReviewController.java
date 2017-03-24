package yaredkb;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ReviewController {
	
	@Resource
	private ReviewRepository reposotory;
	
	
	@RequestMapping("/showReviews")
	public String reviews(Model model){
		model.addAttribute("reviews" ,reposotory.findAll());
		
			return  "reviews";
		}
	@RequestMapping("/showReview")
	public String review(@RequestParam (value="id", required=false, defaultValue="1") Long id, Model model){
		model.addAttribute("review" , reposotory.findOne(id));
			return "review";
	
		}
	
}
