package dev.arias.huapaya.ms_maintenance_report.service.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import dev.arias.huapaya.ms_maintenance_report.model.Master;

public interface MasterService {
    
    public Page<Master> findAll(Pageable pageable);

}
