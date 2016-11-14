package mum.edu.volunteer.repository;

import org.springframework.data.repository.CrudRepository;

import mum.edu.volunteer.domain.Resource;

public interface ResourceRepo extends CrudRepository<Resource, Long> {

}
