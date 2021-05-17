package com.urlwiki.requests;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Add new Article")
public class AddArticleRequest {

	
	@ApiModelProperty(notes = "Article ID")
	private int id;
	
	@ApiModelProperty(notes = "Website Name")
	private String websiteName;
	
	@ApiModelProperty(notes = "Article Category")
	private String category;
	
	@ApiModelProperty(notes = "Article Subcategory")
	private String subCategory;
	
	@ApiModelProperty(notes = "Article Information")
	private String articleInfo;
	
	@ApiModelProperty(notes = "Article URL")
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
	
	
}
