package com.cts.sba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.sba.model.ParentTask;
@Repository
public interface ParentTaskRepository extends JpaRepository<ParentTask, Integer> {

}
