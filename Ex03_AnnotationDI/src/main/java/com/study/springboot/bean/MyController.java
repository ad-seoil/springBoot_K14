package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// Web서버에서 요청을 받아서 처리해주는 역할
public class MyController {
	@Autowired
	// 스프링컨테이너가 주입 getBean()대체
	Member member1;

	// DI <- IOC
	@Autowired
	@Qualifier("printerB")
	// Autowired를 쓰면 자동으로 객체를 찾는데, 객체가 하나가 아닐 경우 어떤 객체를 불러와야하는지 파악을 못해 에러가 나기때문에 Qualifier로 불러올 객체를 지정해줌
	Printer printer;
	
	@Autowired
	Member member2;
	
	@RequestMapping("/")
	// localhost:8080/
	public @ResponseBody String root() {
		member1.print();
		
		member1.setPrinter(printer);
		member1.print();
		
		return "Annotation 사용하기";
	}
}
