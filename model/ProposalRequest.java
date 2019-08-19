package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proposal_request")
public class ProposalRequest {
	@Id
	private long proposalId;
	@Column
	private long userId;
	@Column
	private long mentorId;
	@Column
	private long technologyId;
	@Column
	private String Status;

	public long getProposalId() {
		return proposalId;
	}

	public void setProposalId(long proposalId) {
		this.proposalId = proposalId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getMentorId() {
		return mentorId;
	}

	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}

	public long getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(long technologyId) {
		this.technologyId = technologyId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public ProposalRequest(long proposalId, long userId, long mentorId, long technologyId, String status) {
		super();
		this.proposalId = proposalId;
		this.userId = userId;
		this.mentorId = mentorId;
		this.technologyId = technologyId;
		Status = status;
	}

}
