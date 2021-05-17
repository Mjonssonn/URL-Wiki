package com.urlwiki.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.urlwiki.entities.Article;
import com.urlwiki.repositories.ArticleRepository;


@Service
public class ArticleService {
	
	@Autowired 
	ArticleRepository articleRepo;

	public Collection<Article> getAll() {
		return articleRepo.getAll();
	}
	
	public Article findArticle(int id) {
		return articleRepo.findArticle(id);
	}
	
	public Article addNewArticle(Article article) {
		return articleRepo.addNewArticle(article);
	}
	
	public void deleteArticle(int id) {
		articleRepo.deleteArticle(id);
	}

}
