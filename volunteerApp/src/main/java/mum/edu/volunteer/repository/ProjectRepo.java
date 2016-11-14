package mum.edu.volunteer.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.volunteer.domain.Employee;
import mum.edu.volunteer.domain.Project;

	@Repository
	public interface ProjectRepo extends  CrudRepository<Project, Long> 
	{
		@Query("select e from Employee  e where e.employeeNumber= :employeeNumber")
		public Project findById(@Param("employeeNumber") int projectID);

		
		@Query("select e from Employee  e where e.firstName= :firstName")
		public Project findByName(@Param("firstName") String name);
 	}