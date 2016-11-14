package mum.edu.volunteer.service;

import java.util.List;

import mum.edu.volunteer.domain.Project;
import mum.edu.volunteer.domain.Resource;

public interface ResourceService {
	public void save(Resource project);
	public List<Resource> findAll();
	public Project getProjectByresourceId (int resourceId);
	public Project findByName(String name);
}
