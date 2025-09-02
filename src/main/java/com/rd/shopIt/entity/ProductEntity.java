package com.rd.shopIt.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PRD_ID")
	private long prdId;
	
	@Column(name="PRD_NAME")
	private String prdName;
	
	@Column(name="PRD_DESC")
	private String prdDescription;
	
	@Column(name="PRD_PRICE")
	private long prdPrice;
	
	@Column(name="PRD_STOCK")
	private int prdStock;
	
	@Column(name="PRD_CATEGORY")
	private String prdCategory;
	
	
	public long getPrdId() {
		return prdId;
	}
	public void setPrdId(long prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public String getPrdDescription() {
		return prdDescription;
	}
	public void setPrdDescription(String prdDescription) {
		this.prdDescription = prdDescription;
	}
	public long getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(long prdPrice) {
		this.prdPrice = prdPrice;
	}
	public int getPrdStock() {
		return prdStock;
	}
	public void setPrdStock(int prdStock) {
		this.prdStock = prdStock;
	}
	public String getPrdCategory() {
		return prdCategory;
	}
	public void setPrdCategory(String prdCategory) {
		this.prdCategory = prdCategory;
	}
}
