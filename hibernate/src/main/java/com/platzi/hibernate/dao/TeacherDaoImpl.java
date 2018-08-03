package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.Teacher;

public class TeacherDaoImpl extends PlatziSession implements TeacherDao{
	
	
	private PlatziSession platzisession;
	

	public TeacherDaoImpl() {
		
		platzisession=new PlatziSession();
		
	}

	public void saveTeacher(Teacher teacher) {
		
		platzisession.getSession().save(teacher);
		platzisession.getSession().getTransaction().commit();
		
		
	}

	@SuppressWarnings("unchecked")
	public List<Teacher> findAllTeachers() {
		
		return platzisession.getSession().createQuery("from Teacher").getResultList();
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
