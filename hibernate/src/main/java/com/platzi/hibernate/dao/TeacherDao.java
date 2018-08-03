package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Teacher;

public interface TeacherDao {
	
	void saveTeacher(Teacher teacher);
	
	List<Teacher>findAllTeachers();
	
	void deleteTeacherById(Long idteacher);
	void deleteTeacher(Teacher teacher);
	
	void updateTeacher(Teacher teacher);
	
	Teacher findById(Long idTeacher);
	
	Teacher findByName(String name);
	
	
	

}
