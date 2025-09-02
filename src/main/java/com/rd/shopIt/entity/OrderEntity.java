package com.rd.shopIt.entity;

import jakarta.persistence.*;

@Entity
@Table(name="ORDER_LIST")
public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private long ordId;
	
	@Column(name="USER_ID")
	private long userId;
	
	@Column(name="TOTAL_AMOUNT")
	private long total;
	
	@Column(name="SHIPPING_ADDRESS")
	private String address;
	
	@Column(name="DESCRIPTION")
	private String desc;
	
	@Column(name="STATUS")
	private String status;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getOrdId() {
		return ordId;
	}
	public void setOrdId(long ordId) {
		this.ordId = ordId;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
