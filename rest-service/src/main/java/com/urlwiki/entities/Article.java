package com.urlwiki.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Add new URL request model")				// Note for Swagger UI
@Getter																// Lombok Getter
@Setter																// Lombok Setter
@Entity																// Lets SQL know this is an entity
@Table(name = "API_article")										// Table name in SQL
public class Article {												// Article class

	

	@ApiModelProperty(notes = "Unique ID of an article")			// Article ID -- Note for Swagger UI
	@Id																// Lets SQL know this is an ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) 			// (1,1) SQL
	@Column(name = "id")
	private long id;													
	
	@ApiModelProperty(notes = "Article website name")				// Article website name
	@Column(name = "websiteName")
	private String websiteName;										
	
	@ApiModelProperty(notes = "Category of an article")				// Article category
	@Column(name = "category")
	private String category;										
	
	@ApiModelProperty(notes = "Subcategory of an article")			// Article subcategory
	@Column(name = "subCategory")
	private String subCategory;										
	@ApiModelProperty(notes = "Information about the article")		// Article information
	@Column(name = "articleInfo")
	private String articleInfo;										
	
	@ApiModelProperty(notes = "The article URL")					// Article URL
	@Column(name = "url")											
	private String url;												
	
	
	// Article method
	public Article() {
		
	}
	
	// Article constructor
	public Article(long id, String websiteName, String category, String subCategory, String articleInfo, String url) {
		super();
		this.id = id;
		this.websiteName = websiteName;
		this.category = category;
		this.subCategory = subCategory;
		this.articleInfo = articleInfo;
		this.url = url;
	}
	
	// Getters and setters for Article 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWebsiteName() {
		return websiteName;
	}
	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getArticleInfo() {
		return articleInfo;
	}
	public void setArticleInfo(String articleInfo) {
		this.articleInfo = articleInfo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


	
	
	
}
