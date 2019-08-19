package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PaymentHistory {

	@Id
	private long paymentId;
	@Column
	private long userId;
	@Column
	private long skillId;
	
	@Column
	private String paymentAmount;

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	@Override
	public String toString() {
		return "PaymentHistory [paymentId=" + paymentId + ", userId=" + userId + ", skillId=" + skillId
				+ ", paymentAmount=" + paymentAmount + "]";
	}

	public PaymentHistory(long userId, long skillId, String paymentAmount) {
		super();
		this.userId = userId;
		this.skillId = skillId;
		this.paymentAmount = paymentAmount;
	}
	
    
}
