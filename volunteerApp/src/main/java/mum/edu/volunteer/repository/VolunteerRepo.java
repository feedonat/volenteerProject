package mum.edu.volunteer.repository;

import org.springframework.data.repository.CrudRepository;

import mum.edu.volunteer.domain.Volunteer;

public interface VolunteerRepo extends CrudRepository<Volunteer, Long> {

}
