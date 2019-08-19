package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor_payment")
public class MentorPayment {
	
	@Id
	@Column
	private long mentorPaymentId;
	@Column
	private long mentorId;
	@Column
	private long skillId;
	@Column
	private String slot1;
	@Column
	private String slot2;
	@Column
	private String slot3;
	@Column
	private String slot4;
	public long getMentorPaymentId() {
		return mentorPaymentId;
	}
	public void setMentorPaymentId(long mentorPaymentId) {
		this.mentorPaymentId = mentorPaymentId;
	}
	public long getMentorId() {
		return mentorId;
	}
	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public String getSlot1() {
		return slot1;
	}
	public void setSlot1(String slot1) {
		this.slot1 = slot1;
	}
	public String getSlot2() {
		return slot2;
	}
	public void setSlot2(String slot2) {
		this.slot2 = slot2;
	}
	public String getSlot3() {
		return slot3;
	}
	public void setSlot3(String slot3) {
		this.slot3 = slot3;
	}
	public String getSlot4() {
		return slot4;
	}
	public void setSlot4(String slot4) {
		this.slot4 = slot4;
	}
	public MentorPayment(long mentorId, long skillId, String slot1, String slot2, String slot3, String slot4) {
		super();
		this.mentorId = mentorId;
		this.skillId = skillId;
		this.slot1 = slot1;
		this.slot2 = slot2;
		this.slot3 = slot3;
		this.slot4 = slot4;
	}
	@Override
	public String toString() {
		return "MentorPayment [mentorPaymentId=" + mentorPaymentId + ", mentorId=" + mentorId + ", skillId=" + skillId
				+ ", slot1=" + slot1 + ", slot2=" + slot2 + ", slot3=" + slot3 + ", slot4=" + slot4 + "]";
	}
	
	
	
	

}
