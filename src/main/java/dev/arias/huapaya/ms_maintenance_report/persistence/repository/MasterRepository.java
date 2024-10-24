package dev.arias.huapaya.ms_maintenance_report.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.arias.huapaya.ms_maintenance_report.model.Master;

@Repository
public interface MasterRepository extends MongoRepository<Master, String> {

}
