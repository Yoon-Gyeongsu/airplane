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
	
	public Integer getManagerNum() {
		return managerNum;
	}
	public void setManagerNum(Integer managerNum) {
		this.managerNum = managerNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
