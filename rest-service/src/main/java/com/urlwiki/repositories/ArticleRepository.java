package com.urlwiki.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.urlwiki.entities.Article;
import com.urlwiki.repositories.ArticleRepository;
import com.urlwiki.services.ArticleService;

import lombok.Data;

@Service
@Data
public class ArticleRepository {
	
	ArticleService articleService;

	Map<Long, Article> articles = new HashMap<Long, Article>();

	public Collection<Article> getAll() {
		return articles.values();
	}
	
	public Article findArticle(long id) {
		return articles.get(id);
	}
	
	public Article addNewArticle(Article article) {
		articles.put(article.getId(), article);
		return article;
	}
	
	
	public Article updateArticle(long id, Article updateArticle) {
		return articles.replace(id, updateArticle);
	}
	
	public void deleteArticle(long id) {
		articles.remove(id);
	}
	
	
	
}
