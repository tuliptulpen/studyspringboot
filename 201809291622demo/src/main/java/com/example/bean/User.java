package com.example.bean;

public class User {

	public String id;
	public String name;
	public String pwd;
	
	public  User() {};//无参的构造函数
	
	public User(String id) {//最小的构造函数
		this.id = id;
	};
	
	public User(String id,String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	};
	
	
	
	
}
