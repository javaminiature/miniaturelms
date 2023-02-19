package com.miniature.lms.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.miniature.lms.service.api.CourseService;
import com.miniature.lms.service.api.CourseVO;

@Component
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

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
		publishMessage(courseVO);
	}

	@Override
	public void deleteCourse(CourseVO courseVO) {
		courseRepository.delete(courseVO);
		publishMessage(courseVO);
	}

	@Override
	public void updateCourse(CourseVO courseVO) {
		courseRepository.save(courseVO);
		publishMessage(courseVO);
	}

	protected void publishMessage(CourseVO courseVO) {
		kafkaTemplate.send("miniaturelms.course",courseVO);
	}
}
