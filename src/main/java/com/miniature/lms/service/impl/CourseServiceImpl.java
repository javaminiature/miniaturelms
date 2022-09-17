package com.miniature.lms.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.miniature.lms.service.api.CourseService;
import com.miniature.lms.service.api.CourseVO;

@Component
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;

	@Override
	public List<CourseVO> getCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Optional<CourseVO> getCoursesByID(UUID courseID) {
		return courseRepository.findById(courseID);
	}

	@Override
	public void addCourse(CourseVO courseVO) {
		courseRepository.insert(courseVO);
	}
}
