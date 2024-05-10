package com.boa.crs.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.crs.app.entity.GradesEntity;
import com.boa.crs.app.service.ReportsService;

@RestController
@RequestMapping("/report-services/api/")
public class ReportsController {
	
	@Autowired
	ReportsService reportsService;
	
	@GetMapping
	public List<GradesEntity> generateReport(Long studentId){
		return reportsService.generateReport(studentId);
	}
	
	@GetMapping("/view-grade")
	public GradesEntity viewgrade(Long studentId,Long courseId) {
		return reportsService.viewgrade(studentId, courseId);
	}
	
	@PostMapping
	public String assignGrade(GradesEntity grade) {
		reportsService.assignGrade(grade);
		return "Grade assigned successfully";
	}
	

}
