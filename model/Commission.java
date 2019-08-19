package com.mentorondemand.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Commission {

	
	private long id;
	private int commissionPercentage;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCommissionPercentage() {
		return commissionPercentage;
	}
	public void setCommissionPercentage(int commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	public Commission(long id, int commissionPercentage) {
		super();
		this.id = id;
		this.commissionPercentage = commissionPercentage;
	}
	
	
	
}
