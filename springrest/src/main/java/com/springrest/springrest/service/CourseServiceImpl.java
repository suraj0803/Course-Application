package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145, "Java Core Course", "This course contains the concept of java"));
		list.add(new Course(146, "C++ Course", "This course contains the concept of C++"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		
		for(Course course : list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		
		return c;
	}

@Override	
public Course addCourse(Course course) {
	list.add(course);
	return course;
}

}
