package com.boa.crs.app.service;

import java.util.List;

import com.boa.crs.app.entity.GradesEntity;

public interface ReportsService {
	
	public List<GradesEntity> generateReport(Long studentId);
	public GradesEntity viewgrade(Long studentId,Long courseId);
	public void assignGrade(GradesEntity grade);


}
