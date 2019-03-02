package iotap.host.host.AppFiles.repositories;

import iotap.host.host.AppFiles.entities.Sponsor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("sponsorRepository")
public interface SponsorRepository extends CrudRepository<Sponsor, Integer> {
}
