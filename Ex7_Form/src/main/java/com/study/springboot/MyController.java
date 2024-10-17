package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "hello MyController";
	}
	
	@RequestMapping("/input")
	public ModelAndView inputForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("inputForm2");
		return mv;
	}
	
	@RequestMapping("/test2")
	public @ResponseBody Member inputPorc(HttpServletRequest request) {
		String id = request.getParameter("id");
		String name= request.getParameter("name");
			
		return new Member(id, name);
	}
	
	// @RequestParam - 클라이언트로부터 파라미터를 전달해주는 처리 어노테이션
	// springboot 3.2이전 @RequestParam String id
	// -> 3.2이후 @RequestParam("id") String id
	@RequestMapping("/test2-1")
	public @ResponseBody Member inputPorc2(@RequestParam("id") String id, @RequestParam("name") String name) {
		return new Member(id, name);
	}
	
	// 두개 이상의 데이터를 묶어서 파라미터로 받는 경우
	// @ModelAttribute로 받는게 일반적임
	@RequestMapping("/test2-2")
	public @ResponseBody Member inputPorc3(@ModelAttribute Member member) {
		return member;
	}
	
	// @ModelAttribute는 생략가능함
	@RequestMapping("/test2-3")
	public @ResponseBody Member inputPorc4(Member member, @RequestParam("pwd") String password) {
		member.setPassword(password);
		return member;
	}
	
	// @Pathvariable 
	@RequestMapping("/test3/{Id}/{name}")
	public @ResponseBody Member getMember(@PathVariable("id") String id, @PathVariable("name") String name) {
		return new Member(id, name);
	}
	
	// 입력폼으로 forwarding처리
	@RequestMapping(value = "/test4", method=RequestMethod.GET)
	public String inputProc5() {
		return "inputForm4";
	}
	
	@RequestMapping("/test4Proc")
	public @ResponseBody Member getInfo(Member member) {
		return member;
	}
	
	
	
}
