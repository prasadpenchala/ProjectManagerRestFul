package com.cts.sba.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int task_id;
	
	private String task;
	private Date startdate;
	private Date enddate;
	private int priority;
	private String status;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="parentId")
	private ParentTask parentId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="projectId")
	private Project project;
	
	

	public Task() {
	}
	
	

	public Task(int task_id, String task, Date startdate, Date enddate, int priority, String status) {
		this.task_id = task_id;
		this.task = task;
		this.startdate = startdate;
		this.enddate = enddate;
		this.priority = priority;
		this.status = status;
	}



	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ParentTask getParentId() {
		return parentId;
	}

	public void setParentId(ParentTask parentId) {
		this.parentId = parentId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	
	
	

}
