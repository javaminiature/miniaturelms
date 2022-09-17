package com.miniature.lms.client.dto;

import java.util.UUID;

/**
 * Data Transfer Object for course object
 * which will be used by the clients.
 */
public class CourseDTO {

	UUID courseID;

	String courseTitle;

	float totalHours;

	String source;

	public UUID getCourseID() {
		return courseID;
	}

	public void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public float getTotalHours(double v) {
		return totalHours;
	}

	public void setTotalHours(float totalHours) {
		this.totalHours = totalHours;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
