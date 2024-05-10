package com.boa.crs.app.restcontroller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.crs.app.entity.CourseEntity;
import com.boa.crs.app.model.CourseDetails;
import com.boa.crs.app.service.CourseService;

@RestController
@RequestMapping("/crs-services/api/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping
	public String addCourse(@RequestBody(required=true) CourseDetails courseDetails) {
		var patmentDetailsU = courseService.addCourse(courseDetails, courseDetails.getPaymentDetails());
		return Objects.nonNull(patmentDetailsU) ? "Course added successfully and payment completed"
				: "Course added but payment pending";
	}

	@GetMapping
	public List<CourseEntity> getAllCourses() {
		return courseService.getAllCourse();

	}

	@DeleteMapping
	public String removeCourse(Long courseId) {
		courseService.removeCourse(courseId);
		return "Course Removed Successfully";

	}

	@PutMapping
	public String updateCourse(Long courseId, CourseEntity course) {
		courseService.updateCourse(courseId, course);
		return "Course Updated Successfully";

	}

}
