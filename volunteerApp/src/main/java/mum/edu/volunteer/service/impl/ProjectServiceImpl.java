package mum.edu.volunteer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.volunteer.domain.Employee;
import mum.edu.volunteer.domain.Project;
import mum.edu.volunteer.repository.ProjectRepo;
import mum.edu.volunteer.service.EmployeeService;
import mum.edu.volunteer.service.ProjectService;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService  {

	@Autowired
	private ProjectRepo projectRepo;

	@Override
	public void save(Project project) {
		projectRepo.save(project);
	}
	@Override
	public List<Project> findAll() {
		return (List<Project>)projectRepo.findAll();
	}
	@Override
	public Project getProjectByprojectId(int projectId) {
		return (Project)projectRepo.findById(projectId);
	}
	@Override
	public Project findByName(String projectName) {
		return (Project)projectRepo.findByName(projectName);
	}
	
}
