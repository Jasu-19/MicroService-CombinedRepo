package com.boa.crs.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.crs.app.entity.GradesEntity;

public interface GradesRepository extends JpaRepository<GradesEntity, Long> {
	
	// Customer NAtive qieries 

	List<GradesEntity> findAllByStudentId(Long studentId);

	GradesEntity findByStudentIdAndCourseId(Long studentId, Long courseId);

}
