package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Skills {
	
	
	@Column
	private long skillId;
	@Column
	private String skillName;
	@Column
	private String baseAmount;
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}
	public Skills(long skillId, String skillName, String baseAmount) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.baseAmount = baseAmount;
	}
	@Override
	public String toString() {
		return "Skills [skillId=" + skillId + ", skillName=" + skillName + ", baseAmount=" + baseAmount + "]";
	}
	
	
	

}
