package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Course;

public interface CourseDao {
	
	void saveCourse(Course course);
	
	List<Course>findAllTeachers();
	
	void deleteCourseById(Long idcourse);
	
	void updateCourse(Course course);
	
	Course findById(Long idTeacher);
	
	Course findByName(String name);

}
