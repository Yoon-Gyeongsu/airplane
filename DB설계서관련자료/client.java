package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CLINET_NUM")
	private Integer clientNum;
	
	@Column(name = "NAME_KOR")
	private String nameKor;  //한글이름
	
	@Column(name = "NAME_ENG")
	private String nameEng;  //영어이름
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ADRESS")
	private String adress;
	@Column(name = "ID")
	private String id;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "BIRTH")
	private String birth;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "PHONE_NUM")
	private String phoneNum;
	

}