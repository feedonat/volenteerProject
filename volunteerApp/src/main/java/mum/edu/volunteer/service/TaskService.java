package mum.edu.volunteer.service;

import java.util.List;
import mum.edu.volunteer.domain.Task;

public interface TaskService {

	public void save(Task task);
	public List<Task> findAll();
	public Task getProjectBytaskId (int taskId);
	public Task findByName(String projectName);
}
