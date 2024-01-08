package com.resoTech.taskManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resoTech.taskManagementSystem.dto.Task;
import com.resoTech.taskManagementSystem.repo.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

	private final TaskRepository taskRepository;

	@Autowired
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	public Optional<Task> getTaskById(Long id) {
		return taskRepository.findById(id);
	}

	public Task createTask(Task task) {
		return taskRepository.save(task);
	}

	public Optional<Task> updateTask(Long id, Task updatedTask) {
		if (taskRepository.existsById(id)) {
			updatedTask.setId(id);
			return Optional.of(taskRepository.save(updatedTask));
		}
		return Optional.empty();
	}

	public boolean deleteTask(Long id) {
		if (taskRepository.existsById(id)) {
			taskRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
