package com.rd.shopIt.entity;

import jakarta.persistence.*;

@Entity
@Table(name="ORDER_DETAIL")
public class OrderDtlEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORD_DTL_ID")
	private long ordDtlId;
	
	@Column(name="ORD_ID")
	private long ordId;
	
	@Column(name="PRD_ID")
	private long prdId;

	public long getOrdDtlId() {
		return ordDtlId;
	}

	public void setOrdDtlId(long ordDtlId) {
		this.ordDtlId = ordDtlId;
	}

	public long getOrdId() {
		return ordId;
	}

	public void setOrdId(long ordId) {
		this.ordId = ordId;
	}

	public long getPrdId() {
		return prdId;
	}

	public void setPrdId(long prdId) {
		this.prdId = prdId;
	}

	
}
