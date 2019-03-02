package iotap.host.host.AppFiles.repositories;

import iotap.host.host.AppFiles.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
