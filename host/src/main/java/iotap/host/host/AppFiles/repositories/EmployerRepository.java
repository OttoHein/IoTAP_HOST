package iotap.host.host.AppFiles.repositories;

import iotap.host.host.AppFiles.entities.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("employerRepository")
public interface EmployerRepository extends CrudRepository<Employer,Integer> {
}
