package com.urlwiki.services;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.urlwiki.entities.Article;
import com.urlwiki.repositories.ArticleSqlRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ArticleService {
	

	Logger logger = LoggerFactory.getLogger(ArticleService.class); // Logging the ArticleService Class
	
	private final ArticleSqlRepository articleRepo;
	
	public Collection<Article> getAll() {
		Sort sort = Sort.by(Sort.Direction.ASC, "category", "subCategory", "websiteName");
		return articleRepo.findAll(sort);
	}
	
	public Article findArticle(int id) {
		return articleRepo.findById(id).get();
	}
	
	public Article addNewArticle(Article article) {
		return articleRepo.save(article);
	}
	
	public void deleteArticle(int id) {
		articleRepo.deleteById(id);
	}

}
