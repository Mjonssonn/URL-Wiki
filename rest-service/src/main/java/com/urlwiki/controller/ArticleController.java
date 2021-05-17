package com.urlwiki.controller;

import com.urlwiki.entities.Article;
import com.urlwiki.services.ArticleService;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/article/")
public class ArticleController {
		
	@Autowired
	private ArticleService articleService;	
	
	@GetMapping("/")
	public Collection<Article> getAll() {
		return articleService.getAll();
	}
	
	@GetMapping("/{id}")
	public Article findArticle(@PathVariable int id) {
		return articleService.findArticle(id);
	}
	
	@PostMapping("/")
	public Article addNewArticle(@RequestBody Article article) {
		return articleService.addNewArticle(article);
	}
	
	@DeleteMapping("/{id}")
	public void deleteArticle(@PathVariable int id) {
		articleService.deleteArticle(id);
	}
		
}
 
