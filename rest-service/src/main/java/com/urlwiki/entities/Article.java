package com.urlwiki.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

public class Article {
	
	@ApiModelProperty(notes="Unique Id of an article")
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@ApiModelProperty(notes= "Article website name")
	@Column(name="website_name")
	public String websiteName;
	
	@ApiModelProperty(notes="Category of an article")
	@Column(name="category")
	public String category;
	
	@ApiModelProperty(notes="Subcategory of an article")
	@Column(name="sub_category")
	public String subCategory;
	
	@ApiModelProperty(notes="Information about an article")
	@Column(name="article_info")
	public String articleInfo;
	
	@ApiModelProperty(notes="The article url")
	@Column(name="url")
	public String url;
	

	public Article(int id, String websiteName, String category, String subCategory, String articleInfo, String url) {
			super();
			this.id = id;
			this.websiteName = websiteName;
			this.category = category;
			this.subCategory = subCategory;
			this.articleInfo = articleInfo;
			this.url = url;
		}
	
	
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

	
	
	
}
