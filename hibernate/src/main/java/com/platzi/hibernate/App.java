package com.platzi.hibernate;

import java.util.List;

import com.platzi.hibernate.dao.TeacherDaoImpl;
import com.platzi.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	long id = 2;
    	System.out.println( "Hello World!" );
    	
    	//Teacher teacher = new Teacher("Luis Velez", "avatar");
    	
    	TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
    	Teacher teacher= teacherDaoImpl.findById(id);
    	teacherDaoImpl.deleteTeacher(teacher);
    	
    	//System.out.println(teacher.getName()+" "+teacher.getAvatar());
    	
    	//teacherDaoImpl.saveTeacher(teacher);
    	//teacher.setName("Marco Velez");
    	//teacherDaoImpl.updateTeacher(teacher);
    	
    	//System.out.println(teacher.getName()+" "+teacher.getAvatar());
    	
    	
    	
    	List<Teacher> teachers =teacherDaoImpl.findAllTeachers();
    	for (Teacher t : teachers) {
    		System.out.println(t.getName()+" "+t.getAvatar());
			
		}
    	
 
    }
}
