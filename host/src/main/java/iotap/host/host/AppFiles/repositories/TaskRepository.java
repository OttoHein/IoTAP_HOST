package iotap.host.host.AppFiles.repositories;

import iotap.host.host.AppFiles.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("taskRepository")
public interface TaskRepository extends JpaRepository<Task,Integer> {
}
