package mum.edu.volunteer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mum.edu.volunteer.domain.Task;

@Repository
public interface TaskRepo extends CrudRepository<Task, Long> {

}
