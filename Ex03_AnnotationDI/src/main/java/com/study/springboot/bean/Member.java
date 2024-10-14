package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// 클래스가 하나일때에는 Component에 이름을 안붙여줘도 됨
public class Member {
	@Value("홍길동")
	private String name;
	@Value("도사")
	private String nickname;
	
	@Autowired
	@Qualifier("printerA")
	private Printer printer;
	
	public Member() {}
	// default생성자 쇼스코드에 없으며 컴파일시 추가
	// dafault super()도 컴파일시 추가

	public Member(String name, String nickname, Printer printer) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}

	// 카멜방식 + 필드명
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public Printer getPrinter() {
		return printer;
	}

	public void print() {
		printer.print("Hello " + name + " : " + nickname);
	}
}
