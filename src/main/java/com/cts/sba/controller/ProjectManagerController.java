package com.cts.sba.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.sba.dao.ParentTaskRepository;
import com.cts.sba.dao.ProjectRepository;
import com.cts.sba.dao.TaskRepository;
import com.cts.sba.dao.UserRepository;
import com.cts.sba.model.ParentTask;
import com.cts.sba.model.Project;
import com.cts.sba.model.Task;

@RestController
@RequestMapping("/api")
public class ProjectManagerController {

	@Autowired
	private ParentTaskRepository parentTaskRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private ProjectRepository projectRepository;
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/addproject")
	public Project createProject(){
		System.out.println("Addproject.....");
		Project project = new Project();
		project.setProject("Disqus");
		project.setPriority(20);
		project.setStartDate(new Date());
		project.setEndDate(new Date());
		
		return projectRepository.save(project);
		
	}
	
	@PostMapping("/addparent")
	public ParentTask createParentTask(){
		System.out.println("AddParentTask.....");
		ParentTask parent = new ParentTask();
		parent.setParentTask("task1");;
		
		
		return parentTaskRepository.save(parent);
		
	}
	
	@PostMapping("/addtask")
	public Task createTask(){
		ParentTask parent = new ParentTask(1,"parenttask1");
		Project project = new Project(1,"project1",new Date(),new Date(),20);
		
		System.out.println("AddParentTask.....");
		Task task = new Task(1,"task1",new Date(),new Date(),20,"progress");
		task.setProject(project);
		task.setParentId(parent);
		
		
		
		return taskRepository.save(task);
		
	}
}
