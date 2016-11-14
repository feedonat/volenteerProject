package mum.edu.volunteer.service;

import java.util.List;
import mum.edu.volunteer.domain.Service;

public interface VolenteerService_service {

	public void save(Service project);
	public List<Service> findAll();
	public Service getProjectByserviceId (int projectId);
	public Service findByName(String projectName);
}
