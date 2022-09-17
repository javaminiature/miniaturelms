package com.miniature.lms.client.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniature.lms.client.dto.CourseDTO;
import com.miniature.lms.service.api.CourseService;
import com.miniature.lms.service.api.CourseVO;

@RestController
public class CourseRestController {

	@Autowired
	CourseService courseService;

	@GetMapping("/Course")
	public List<CourseDTO> getCourses() {
		List<CourseVO> courseVOs = courseService.getCourses();
		List<CourseDTO> courseList = courseVOs.stream().map(this::getCourseDTO).collect(Collectors.toList());
		return courseList;
	}

	@GetMapping("/Course/{courseID}")
	public CourseDTO getCoursesByID(@PathVariable UUID courseID) {
		Optional<CourseVO> courseVO = courseService.getCoursesByID(courseID);
		return getCourseDTO(courseVO.isPresent()?courseVO.get():null);
	}

	@PostMapping("/Course")
	public void addCourse(@RequestBody CourseDTO courseDTO) {
		courseDTO.setCourseID(UUID.randomUUID());
		courseService.addCourse(getCourseVO(courseDTO));
	}

	protected CourseDTO getCourseDTO(CourseVO courseVO) {
		CourseDTO courseDTO=new CourseDTO();
		if(courseVO !=null ) BeanUtils.copyProperties(courseVO,courseDTO);
		return courseDTO;
	}

	protected CourseVO getCourseVO(CourseDTO courseDTO) {
		CourseVO courseVO=new CourseVO();
		if(courseDTO !=null) BeanUtils.copyProperties(courseDTO,courseVO);
		return courseVO;
	}
}
