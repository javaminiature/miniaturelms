package com.miniature.lms.service.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface CourseService {

	/**
	 * API to get all courses
	 * @return
	 */
	List<CourseVO> getCourses();

	/**
	 * Get course by course ID.
	 * @param courseID
	 * @return
	 */
	Optional<CourseVO> getCoursesByID(UUID courseID);

	/**
	 * Add a Course
	 * @param courseVO
	 */
	void addCourse(CourseVO courseVO);

	/**
	 * delete a Course
	 * @param courseVO
	 */
	void deleteCourse(CourseVO courseVO);

	/**
	 * update a Course
	 * @param courseVO
	 */
	void updateCourse(CourseVO courseVO);
}
