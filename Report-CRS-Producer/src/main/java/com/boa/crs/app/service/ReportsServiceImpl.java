package com.boa.crs.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.boa.crs.app.entity.GradesEntity;
import com.boa.crs.app.repo.GradesRepository;

public class ReportsServiceImpl implements ReportsService {
	
	@Autowired
	GradesRepository gradesrepo;


	@Override
	public List<GradesEntity> generateReport(Long studentId) {
		return gradesrepo.findAllByStudentId(studentId);
	}


	@Override
	public GradesEntity viewgrade(Long studentId, Long courseId) {
		return gradesrepo.findByStudentIdAndCourseId(studentId,courseId);
	}


	@Override
	public void assignGrade(GradesEntity grade) {
		gradesrepo.save(grade);
	}

}
