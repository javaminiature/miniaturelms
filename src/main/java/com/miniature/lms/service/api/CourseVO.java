package com.miniature.lms.service.api;


import java.util.UUID;


import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * Course Value Object which is used for transferring the data
 * to and from Service to Data Access Layer
 */
@Table("pa_course")
public class CourseVO {

	@PrimaryKey("course_guid")
	UUID courseID;

	@Column("course_title")
	String courseTitle;

	@Column("total_hours")
	float totalHours;

	@Column("source")
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

	public float getTotalHours() {
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
