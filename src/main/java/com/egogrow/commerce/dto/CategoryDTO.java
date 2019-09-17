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
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public String getCategoryCode() {
		return categoryCode;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public String getCategoryName() {
		return categoryName;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public String getCategoryCodeRef() {
		return categoryCodeRef;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public void setCategoryCodeRef(String categoryCodeRef) {
		this.categoryCodeRef = categoryCodeRef;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public Integer getCategoryDepth() {
		return categoryDepth;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public void setCategoryDepth(Integer categoryDepth) {
		this.categoryDepth = categoryDepth;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public Integer getCategoryCodeRefCount() {
		return categoryCodeRefCount;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	public void setCategoryCodeRefCount(Integer categoryCodeRefCount) {
		this.categoryCodeRefCount = categoryCodeRefCount;
	}
	
	/**
	 * 권한 일련 번호를 반환합니다.
	 * @return
	 */
	@Override
	public String toString() {
		return "CategoryDTO [categoryCode=" + categoryCode + ", categoryName=" + categoryName + ", categoryCodeRef="
				+ categoryCodeRef + ", categoryDepth=" + categoryDepth + ", categoryCodeRefCount="
				+ categoryCodeRefCount + "]";
	}

}