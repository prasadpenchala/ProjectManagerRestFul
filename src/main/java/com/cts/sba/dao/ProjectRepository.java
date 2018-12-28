package com.cts.sba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.sba.model.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
