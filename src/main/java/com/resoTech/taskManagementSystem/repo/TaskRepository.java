package com.resoTech.taskManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resoTech.taskManagementSystem.dto.Task;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

	// Custom query method to find tasks by title
	List<Task> findByTitle(String title);
}
