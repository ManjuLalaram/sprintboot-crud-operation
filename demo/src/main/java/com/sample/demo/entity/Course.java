package com.sample.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Course {

	@Id
	@Column(name = "course_code")
	private String courseCode;
	
	@Column(name = "title_description")
	private String titleDescription;
	private String capacity;
	private String scheduled;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getTitleDescription() {
		return titleDescription;
	}
	public void setTitleDescription(String titleDescription) {
		this.titleDescription = titleDescription;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getScheduled() {
		return scheduled;
	}
	public void setScheduled(String scheduled) {
		this.scheduled = scheduled;
	}
	
	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", titleDescription=" + titleDescription + ", capacity=" + capacity
				+ ", scheduled=" + scheduled + "]";
	}
	
	
}
