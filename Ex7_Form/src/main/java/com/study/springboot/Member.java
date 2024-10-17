package com.study.springboot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	private String id;
	private String name;
	private String password;
	private String addr;
	private String mail;
	
	public Member(String id, String name, String password, String addr, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.addr = addr;
		this.mail = mail;
	}

	public Member() {
		
	}
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Member(String id, String name, String password, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.addr = addr;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", addr=" + addr + "]";
	}

}


	
