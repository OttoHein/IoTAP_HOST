package iotap.host.host.AppFiles.repositories;

import iotap.host.host.AppFiles.entities.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("taskDetailRepository")
public interface TaskDetailRepository extends CrudRepository<Task,Integer> {
}
