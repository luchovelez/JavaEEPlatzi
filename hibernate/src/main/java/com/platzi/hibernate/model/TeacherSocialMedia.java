package com.platzi.hibernate.model;

import java.io.Serializable;

public class TeacherSocialMedia implements Serializable {
	
	private Long idSocialMedia;
	private Teacher teacher;
	private SocialMedia socialMedia;
	
	public TeacherSocialMedia(Teacher teacher, SocialMedia socialMedia) {
		super();
		this.teacher = teacher;
		this.socialMedia = socialMedia;
	}
	public TeacherSocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdSocialMedia() {
		return idSocialMedia;
	}
	public void setIdSocialMedia(Long idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public SocialMedia getSocialMedia() {
		return socialMedia;
	}
	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}
	
	
	
	
	

}
