package mum.edu.volunteer.repository;

import org.springframework.data.repository.CrudRepository;

import mum.edu.volunteer.domain.Beneficiary;

public interface BeneficiaryRepo extends CrudRepository<Beneficiary, Long> {

}
