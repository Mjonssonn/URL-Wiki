package com.urlwiki.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.urlwiki.entities.Article;
import com.urlwiki.repositories.ArticleRepository;

import lombok.Data;

@Service
@Data
public class ArticleRepository {

	Map<Integer, Article> articles = new HashMap<Integer, Article>();

	
}
