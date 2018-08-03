package com.platzi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.hibernate.model.Course;
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
    	SessionFactory sessionFactory;
    	Configuration configuration = new Configuration();
    	configuration.configure();
    	sessionFactory = configuration.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	
    	Course course= new Course ("Curso java", "introduccion Hibernate", "Proyecto Final") ; 
    	//Teacher teacher = new Teacher("Luis Velez", "avatar");
    	//Teacher teacher2 = new Teacher("Marco Velez", "avatar");
    	session.beginTransaction();
    	//session.save(teacher);
    	session.save(course);
    	session.getTransaction().commit();
    	session.close();
        
    }
}
