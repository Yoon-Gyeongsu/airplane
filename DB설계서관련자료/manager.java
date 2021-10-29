package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MANAGER_NUM")
	private Integer managerNum;
	
	@Column(name = "ID")
	private String id;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "NAME")
	private String name;
	@Column(name = "POSITION")
	private String position;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "IDENTIFICATION")
	private String identification;
	@Column(name = "PHONE_NUM")
	private String phoneNum;
	
}
