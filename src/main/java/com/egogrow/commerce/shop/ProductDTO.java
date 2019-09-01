package com.egogrow.commerce.shop;

import java.util.Date;

public class ProductDTO {
	
	private int product_no;
	private String product_name;
	private int product_price;
	private int product_stock;
	private String product_explain;
	private Date product_reg_date;
	
	// getter, setter, tostring
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}
	public String getProduct_explain() {
		return product_explain;
	}
	public void setProduct_explain(String product_explain) {
		this.product_explain = product_explain;
	}
	public Date getProduct_reg_date() {
		return product_reg_date;
	}
	public void setProduct_reg_date(Date product_reg_date) {
		this.product_reg_date = product_reg_date;
	}
	@Override
	public String toString() {
		return "ProductDTO [product_no=" + product_no + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_stock=" + product_stock + ", product_explain=" + product_explain
				+ ", product_reg_date=" + product_reg_date + "]";
	}	
	

}
