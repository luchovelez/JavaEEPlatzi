package com.platzi.hibernate.dao;

import java.util.List;

import com.platzi.hibernate.model.SocialMedia;

public interface SocialMediaDao {
	
	void saveCourse(SocialMedia socialMedia);
	
	List<SocialMedia>findAllTeachers();
	
	void deletesocialMediaById(Long idsocialMedia);
	
	void updateSocialMedia(SocialMedia socialMedia);
	
	SocialMedia findById(Long idTeacher);
	
	SocialMedia findByName(String name);
	
	
	
}
