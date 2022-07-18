package com.springrest.springrest.service;
import java.util.*;
import com.springrest.springrest.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
}
