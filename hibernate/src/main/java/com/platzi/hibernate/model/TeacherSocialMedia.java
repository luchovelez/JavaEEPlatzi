package com.platzi.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="profesor_red")
public class TeacherSocialMedia implements Serializable {
	
	@Id
	@Column(name="ID_red")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSocialMedia;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_profesor")
	private Teacher teacher;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_red")
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
