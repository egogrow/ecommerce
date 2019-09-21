package com.egogrow.commerce.dto;

public class CategoryDTO {
	/*  
    CATEGORY_CODE		varchar(20)		not null
    CATEGORY_NAME		varchar(255)	not null
    CATEGORY_CODE_REF	varchar(20)		null
    CATEGORY_DEPTH		tinyint(2)		not null
 	*/
	private String categoryCode;
	private String categoryName;
	private String categoryCodeRef;
	private Integer categoryDepth;
	private Integer categoryCodeRefCount;
	
	/**
	 * .
	 * @return
	 */
	public String getCategoryCode() {
		return categoryCode;
	}
	
	/**
	 * .
	 * @return
	 */
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	/**
	 * .
	 * @return
	 */
	public String getCategoryName() {
		return categoryName;
	}
	
	/**
	 * .
	 * @return
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	/**
	 * .
	 * @return
	 */
	public String getCategoryCodeRef() {
		return categoryCodeRef;
	}
	
	/**
	 * .
	 * @return
	 */
	public void setCategoryCodeRef(String categoryCodeRef) {
		this.categoryCodeRef = categoryCodeRef;
	}
	
	/**
	 * .
	 * @return
	 */
	public Integer getCategoryDepth() {
		return categoryDepth;
	}
	
	/**
	 * .
	 * @return
	 */
	public void setCategoryDepth(Integer categoryDepth) {
		this.categoryDepth = categoryDepth;
	}
	
	/**
	 * .
	 * @return
	 */
	public Integer getCategoryCodeRefCount() {
		return categoryCodeRefCount;
	}
	
	/**
	 * .
	 * @return
	 */
	public void setCategoryCodeRefCount(Integer categoryCodeRefCount) {
		this.categoryCodeRefCount = categoryCodeRefCount;
	}
	
	/**
	 * .
	 * @return
	 */
	@Override
	public String toString() {
		return "CategoryDTO [categoryCode=" + categoryCode + ", categoryName=" + categoryName + ", categoryCodeRef="
				+ categoryCodeRef + ", categoryDepth=" + categoryDepth + ", categoryCodeRefCount="
				+ categoryCodeRefCount + "]";
	}

}