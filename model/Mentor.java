package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name= "mentor")
public class Mentor {
 
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private long mentorId;
	@Column
	 private String firstName;
	@Column
	 private String  lastName;
	@Column
	 private String email;
	@Column
	 private String password;
	@Column
	 private String contactNumber;
	 private String linkedinUrl;
	 @Column
	 private String regDateTime;
	 @Column
	 private String regCode;
	 @Column
	 private String skills;
	 @Column
	 private String currentCourse;
	 @Column
     private String yearOfExperience;
	 @Column
     private String rating;
	 @Column
     private String selfRating;
	 @Column
     private String status;
	public long getMentorId() {
		return mentorId;
	}
	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public String getRegDateTime() {
		return regDateTime;
	}
	public void setRegDateTime(String regDateTime) {
		this.regDateTime = regDateTime;
	}
	public String getRegCode() {
		return regCode;
	}
	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getCurrentCourse() {
		return currentCourse;
	}
	public void setCurrentCourse(String currentCourse) {
		this.currentCourse = currentCourse;
	}
	public String getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(String yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSelfRating() {
		return selfRating;
	}
	public void setSelfRating(String selfRating) {
		this.selfRating = selfRating;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Mentor(long mentorId, String firstName, String lastName, String email, String password, String contactNumber,
			String linkedinUrl, String regDateTime, String regCode, String skills, String currentCourse,
			String yearOfExperience, String rating, String selfRating, String status) {
		super();
		this.mentorId = mentorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this.linkedinUrl = linkedinUrl;
		this.regDateTime = regDateTime;
		this.regCode = regCode;
		this.skills = skills;
		this.currentCourse = currentCourse;
		this.yearOfExperience = yearOfExperience;
		this.rating = rating;
		this.selfRating = selfRating;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + ", contactNumber=" + contactNumber + ", linkedinUrl=" + linkedinUrl
				+ ", regDateTime=" + regDateTime + ", regCode=" + regCode + ", skills=" + skills + ", currentCourse="
				+ currentCourse + ", yearOfExperience=" + yearOfExperience + ", rating=" + rating + ", selfRating="
				+ selfRating + ", status=" + status + "]";
	}
	 
	 
}
