package mum.edu.volunteer.service;

import java.util.List;
import mum.edu.volunteer.domain.Project;

public interface ProjectService {
	public void save(Project project);
	public List<Project> findAll();
	public Project getProjectByprojectId (int projectId);
	public Project findByName(String projectName);
	
}
