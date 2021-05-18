package com.urlwiki.entities;

import io.swagger.annotations.ApiModelProperty;

public class Article {

	

	@ApiModelProperty(notes = "Unique ID of an article")
	private int id;
	
	@ApiModelProperty(notes = "Article website name")
	private String websiteName;
	
	@ApiModelProperty(notes = "Category of an article")
	private String category;
	
	@ApiModelProperty(notes = "Subcategory of an article")
	private String subCategory;
	
	@ApiModelProperty(notes = "Information about the article")
	private String articleInfo;
	
	@ApiModelProperty(notes = "The article URL")
	private String url;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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

	public Article(int id, String websiteName, String category, String subCategory, String articleInfo, String url) {
		super();
		this.id = id;
		this.websiteName = websiteName;
		this.category = category;
		this.subCategory = subCategory;
		this.articleInfo = articleInfo;
		this.url = url;
	}
	
	
	
}
