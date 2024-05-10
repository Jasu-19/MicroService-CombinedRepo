package com.boa.crs.app.restcontroller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.boa.crs.app.entity.CourseEntity;

@SpringBootTest
@AutoConfigureMockMvc
public class CourseControllerTest {

	@Autowired
	private CourseController courseController;

	@Autowired
	private MockMvc mockmvc;
	

	@Test
	public void testgetAllCourses() throws Exception {

		List<CourseEntity> actual = courseController.getAllCourses();
		assertThat(actual).isNotNull();

		mockmvc.perform(MockMvcRequestBuilders.get("/crs-services/api/course").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
	
}
