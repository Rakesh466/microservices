package com.bug.report;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BugVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String emailAddress;
	private String owner; 
	private String priority;
	private String status; 
	private String ownerProject; 
	private Date createdDate; 
	private String completionDate; 
	private String description; 
	private String attachedFiles;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwnerProject() {
		return ownerProject;
	}
	public void setOwnerProject(String ownerProject) {
		this.ownerProject = ownerProject;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAttachedFiles() {
		return attachedFiles;
	}
	public void setAttachedFiles(String attachedFiles) {
		this.attachedFiles = attachedFiles;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}
	
}
