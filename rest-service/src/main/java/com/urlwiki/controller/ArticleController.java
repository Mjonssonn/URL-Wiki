package com.urlwiki.controller;

import com.urlwiki.entities.Article;
import com.urlwiki.services.ArticleService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
	
	
	Map<Integer, Article> articles = new HashMap<Integer, Article>();
	
	
	@GetMapping("/")
	public Collection<Article> getAll() {
		return articles.values();
	}
	
	@GetMapping("/{id}")
	public Article find(@PathVariable int id) {
		return articles.get(id);
	}
	
	@PostMapping("/")
	public Article addNewUser(@RequestBody Article article) {
		articles.put(article.getId(), article);
		return article;
	}
	
	@DeleteMapping("/{id}")
	public String deleteArticle(@PathVariable int id) {
		String delete = articleService.deleteArticle();
		return delete;
	}
		
		
//	@PostMapping("/")
//	public Article addNewArticle(@RequestBody Article article) {
//		article.setId(article.getId());
//		article.setWebsiteName(article.getWebsiteName());
//		article.setWebsiteName(article.getCategory());
//		article.setWebsiteName(article.getSubCategory());
//		article.setWebsiteName(article.getArticleInfo());
//		article.setWebsiteName(article.getUrl());
//		
//		return article;
//	}
		
}
 
