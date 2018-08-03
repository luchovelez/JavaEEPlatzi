package com.platzi.hibernate;

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
    	
    	System.out.println( "Hello World!" );
    	
    	Teacher teacher = new Teacher("Luis Velez", "avatar");
    	
    	TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
    	
    	teacherDaoImpl.saveTeacher(teacher);
    	
 
    }
}
