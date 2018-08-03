package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Teacher;

public class TeacherDaoImpl extends PlatziSession implements TeacherDao{
	
	
	private PlatziSession platzisession;

	public TeacherDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void saveTeacher(Teacher teacher) {
		
		platzisession.getSession().persist(teacher);
		platzisession.getSession().getTransaction().commit();
		
		
	}

	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteTeacherById(Long idteacher) {
		// TODO Auto-generated method stub
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
