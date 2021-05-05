package com.urlwiki.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urlwiki.repositories.ArticleRepository;


@Service
public class ArticleService {
	
	@Autowired 
	ArticleRepository articleRepo;

//	public Article findArticle() {
//		return articleRepo.findArticle();
//		
//	}
	
	public String addArticle() {
		
		return "" ;
	}

	public String readArticle() {
		return "read article";
	}
	
	public String deleteArticle() {
		return "delete article";
	}
}
