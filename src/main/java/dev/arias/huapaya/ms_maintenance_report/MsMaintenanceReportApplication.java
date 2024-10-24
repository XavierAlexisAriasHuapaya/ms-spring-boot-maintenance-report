package dev.arias.huapaya.ms_maintenance_report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsMaintenanceReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMaintenanceReportApplication.class, args);
	}

}
