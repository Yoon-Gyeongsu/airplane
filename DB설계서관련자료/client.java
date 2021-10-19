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
	
	public Integer getClientNum() {
		return clientNum;
	}
	public void setClientNum(Integer clientNum) {
		this.clientNum = clientNum;
	}
	public String getNameKor() {
		return nameKor;
	}
	public void setNameKor(String nameKor) {
		this.nameKor = nameKor;
	}
	public String getNameEng() {
		return nameEng;
	}
	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}