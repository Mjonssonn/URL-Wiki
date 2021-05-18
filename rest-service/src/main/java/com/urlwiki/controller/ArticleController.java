package com.urlwiki.controller;

import com.urlwiki.entities.Article;
import com.urlwiki.services.ArticleService;

import io.swagger.annotations.ApiOperation;

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
	@ApiOperation(
			value = "Get all articles", 
			notes = "Get all articles from database",
			response = Article.class,
			responseContainer = "List")
	public Collection<Article> getAll() {
		return articleService.getAll();
	}
	
	@GetMapping("/{id}")
	@ApiOperation(
			value = "Find article by ID", 
			notes = "Find a specific article by ID",
			response = Article.class,
			responseContainer = "List")
	public Article findArticle(@PathVariable int id) {
		return articleService.findArticle(id);
	}
	
	@PostMapping("/")
	@ApiOperation(
			value = "Add new article", 
			notes = "Add a new article to the database",
			response = Article.class,
			responseContainer = "List")
	public Article addNewArticle(@RequestBody Article article) {
		return articleService.addNewArticle(article);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(
			value = "Delete article", 
			notes = "Remove an article from the database",
			response = Article.class,
			responseContainer = "List")
	public void deleteArticle(@PathVariable int id) {
		articleService.deleteArticle(id);
	}
		
}
 
