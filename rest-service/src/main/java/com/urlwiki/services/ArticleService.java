package com.urlwiki.services;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping 
public class ArticleService {
	
	
	
	@GetMapping("/find-article")
	public String findArticle() {
		return "HTTP article was searched found";
	}
	
	@GetMapping()
	public String searchArticle() {
		return "HTTP article was searched for";

	}
	
	
	@GetMapping()
	public String readArticle() {
		return "HTTP article was read";

	}
	
	
	@PostMapping()
	public String addArticle() {
		return "HTTP article was added";
	}
	
	
	@PutMapping()
	public String updateArticle() {
		return "HTTP article was updated";
	}
	
	
	@DeleteMapping()
	public String deleteArticle() {
		return "HTTP article was deleted";
	}
	
	
	

}

