package com.westagileMicroservices.dto;

public class WestAgileLab {
	private long id;
	private String fullName;
	private String emailAddress;
	private String phoneNumber;
	private String projectDescription;
	public long getId() {
		return id;
	}
	public String getFullName() {
		return fullName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	

}
