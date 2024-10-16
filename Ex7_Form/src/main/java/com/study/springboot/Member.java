package com.study.springboot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	private String id;
	private String name;
	
	
	public Member() {
		
	}
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "회원정보 [아이디=" + id + ", 이름" + name + "]";
	}
	
	
	
}


	
