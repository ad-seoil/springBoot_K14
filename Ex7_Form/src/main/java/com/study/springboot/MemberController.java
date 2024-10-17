package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MemberController {
	
	@RequestMapping(value = "/", method =RequestMethod.GET)
	public @ResponseBody String root(){
		String message = new String("Form 데이터 전달받아 사용하기");
		return message;
	}
	
	@RequestMapping(value = "test1", method =RequestMethod.GET)
	public String test1(HttpServletRequest request, Model model) {
		// Parameter는 클라이언트로부터 넘어온 값 id = hong & name = 홍길동
		String id = request.getParameter("id");	// hong
		String name = request.getParameter("name");	//홍길동
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		
		return "test1";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String logInForm() {
		return "inputForm";
	}
	
	@RequestMapping(value = "test1", method =RequestMethod.POST)
	public String test2(HttpServletRequest request, Model model) {
		// Parameter는 클라이언트로부터 넘어온 값 id = hong & name = 홍길동
		String id = request.getParameter("id");	// hong
		String name = request.getParameter("name");	//홍길동
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		
		// view로 이동처리 = forward
		return "test1";
	}
}
