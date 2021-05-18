package com.urlwiki.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.urlwiki.entities.Article;

public interface ArticleSqlRepository extends JpaRepository<Article, Integer>{
	
	List<Article> findByWebsiteName(String websiteName);
	
}
