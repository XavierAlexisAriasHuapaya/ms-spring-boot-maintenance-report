package dev.arias.huapaya.ms_maintenance_report.presentation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.arias.huapaya.ms_maintenance_report.model.Master;
import dev.arias.huapaya.ms_maintenance_report.service.interfaces.MasterService;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@RestController
@RequestMapping(path = "master")
public class MasterController {

    private final MasterService masterService;

    @GetMapping
    public ResponseEntity<?> findAll(Pageable pageable) {
        Map<String, Object> response = new HashMap<>();
        Page<Master> page = this.masterService.findAll(pageable);
        if (page.getContent().isEmpty()) {
            response.put("message", "Empty record");
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        return new ResponseEntity<>(page, HttpStatus.OK);
    }

}
