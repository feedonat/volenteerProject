package mum.edu.volunteer.repository;

import org.springframework.data.repository.CrudRepository;

import mum.edu.volunteer.domain.Service;

public interface ServiceRepo extends CrudRepository<Service, Long> {

}
