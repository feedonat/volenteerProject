package mum.edu.volunteer.service;

import java.util.List;
import mum.edu.volunteer.domain.Volunteer;

public interface VolenteerService {

	public void save(Volunteer project);
	public List<Volunteer> findAll();
	public Volunteer getProjectByvId (int projectId);
	public Volunteer findByName(String projectName);
}
