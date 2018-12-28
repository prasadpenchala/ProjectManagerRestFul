package com.cts.sba.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ParentTask")
public class ParentTask implements Serializable{
	
	
	public ParentTask() {
	}
	
	

	public ParentTask(int parentId, String parentTask) {
		this.parentId = parentId;
		this.parentTask = parentTask;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parentId;

	private String parentTask;

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentTask() {
		return parentTask;
	}

	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}

	@Override
	public String toString() {
		return "ParentTask [parentId=" + parentId + ", parentTask=" + parentTask + "]";
	}
	
	
}
