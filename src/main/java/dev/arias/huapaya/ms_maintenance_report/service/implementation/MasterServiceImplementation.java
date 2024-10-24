package dev.arias.huapaya.ms_maintenance_report.service.implementation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.arias.huapaya.ms_maintenance_report.model.Master;
import dev.arias.huapaya.ms_maintenance_report.persistence.repository.MasterRepository;
import dev.arias.huapaya.ms_maintenance_report.service.interfaces.MasterService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MasterServiceImplementation implements MasterService{
    
    private final MasterRepository masterRepository;

    @Transactional(readOnly = true)
    @Override
    public Page<Master> findAll(Pageable pageable) {
        return this.masterRepository.findAll(pageable);
    }
    
}
