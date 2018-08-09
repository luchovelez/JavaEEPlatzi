package com.platzi.hibernate.dao;

import java.util.List;


import org.hibernate.Session;

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
		Session session ;
	    Teacher teacher ;

	    session = platzisession.getSession();
	    teacher = (Teacher)session.load(Teacher.class,idteacher);
	    session.delete(teacher);

	    //Esto hace que el delete pendiente se realice 
	    session.flush() ;
	    platzisession.getSession().getTransaction().commit();
		
		
	}


	public void updateTeacher(Teacher teacher) {
		Session session ;
	  	session = platzisession.getSession();
	    session.update(teacher);
	    session.flush();
	    platzisession.getSession().getTransaction().commit();
		
		
	}

	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return platzisession.getSession().load(Teacher.class, idTeacher);
	}

	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return platzisession.getSession().load(Teacher.class, name);
	}

	public void deleteTeacher(Teacher teacher) {
		platzisession.getSession().delete(teacher);
		platzisession.getSession().getTransaction().commit();
		
		
	}

	

}
