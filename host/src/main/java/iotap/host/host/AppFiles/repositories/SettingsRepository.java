package iotap.host.host.AppFiles.repositories;

import iotap.host.host.AppFiles.entities.Settings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("settingsRepository")
public interface SettingsRepository extends CrudRepository<Settings,Integer> {
}
