package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "trainings")
public class Trainings {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long trainingId;
	@Column
	private long skillId;
	@Column
	private long mentorId;
	@Column
    private String startTime;
	@Column
    private String endTime;
	@Column
    private String totalStudents;
	public long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}
	public long getSkillId() {
		return skillId;
	}
	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}
	public long getMentorId() {
		return mentorId;
	}
	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getTotalStudents() {
		return totalStudents;
	}
	public void setTotalStudents(String totalStudents) {
		this.totalStudents = totalStudents;
	}
	@Override
	public String toString() {
		return "Trainings [trainingId=" + trainingId + ", skillId=" + skillId + ", mentorId=" + mentorId
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", totalStudents=" + totalStudents + "]";
	}
	public Trainings( long skillId, long mentorId, String startTime, String endTime,
			String totalStudents) {
		super();
	
		this.skillId = skillId;
		this.mentorId = mentorId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.totalStudents = totalStudents;
	}
    
	
	
	
	
}
