package com.egogrow.commerce.dto;

public class CategoryDTO {
/*  
    CATEGORY_CODE		varchar(20)		not null,
    CATEGORY_NAME		varchar(255)	not null,
    CATEGORY_CODE_REF	varchar(20)		null,
    CATEGORY_DEPTH		tinyint(2)		not null,
*/
	
	private String categoryCode;
	private String categoryName;
	private String categoryCodeRef;
	private Integer categoryDepth;
	private Integer categoryCodeRefCount;
	
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryCodeRef() {
		return categoryCodeRef;
	}
	public void setCategoryCodeRef(String categoryCodeRef) {
		this.categoryCodeRef = categoryCodeRef;
	}
	public Integer getCategoryDepth() {
		return categoryDepth;
	}
	public void setCategoryDepth(Integer categoryDepth) {
		this.categoryDepth = categoryDepth;
	}
	public Integer getCategoryCodeRefCount() {
		return categoryCodeRefCount;
	}
	public void setCategoryCodeRefCount(Integer categoryCodeRefCount) {
		this.categoryCodeRefCount = categoryCodeRefCount;
	}
	@Override
	public String toString() {
		return "CategoryDTO [categoryCode=" + categoryCode + ", categoryName=" + categoryName + ", categoryCodeRef="
				+ categoryCodeRef + ", categoryDepth=" + categoryDepth + ", categoryCodeRefCount="
				+ categoryCodeRefCount + "]";
	}

}