package com.egogrow.commerce.dto;

public class CategoryDTO {
	
	private String categoryCode;
	private String categoryName;
	private String categoryCodeRef;
	private Integer categoryDepth;
	private Integer categoryCodeRefCount;
	
	public String getcategoryCode() {
		return categoryCode;
	}
	public void setcategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getcategoryName() {
		return categoryName;
	}
	public void setcategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getcategoryCodeRef() {
		return categoryCodeRef;
	}
	public void setcategoryCodeRef(String categoryCodeRef) {
		this.categoryCodeRef = categoryCodeRef;
	}
	public Integer getcategoryDepth() {
		return categoryDepth;
	}
	public void setcategoryDepth(Integer categoryDepth) {
		this.categoryDepth = categoryDepth;
	}
	public Integer getcategoryCodeRefCount() {
		return categoryCodeRefCount;
	}
	public void setcategoryCodeRefCount(Integer categoryCodeRefCount) {
		this.categoryCodeRefCount = categoryCodeRefCount;
	}
	@Override
	public String toString() {
		return "CategoryDTO [categoryCode=" + categoryCode + ", categoryName=" + categoryName + ", categoryCodeRef="
				+ categoryCodeRef + ", categoryDepth=" + categoryDepth + ", categoryCodeRefCount=" + categoryCodeRefCount + "]";
	}

}