package com.study.springboot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	private Integer no;
	private String name;
	private String addr;
	private Integer age;
	
	public Member() {
		
	}
	
	public Member(Integer no, String name, String addr, Integer age) {
		super();
		this.no = no;
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
}
