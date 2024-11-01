package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
		return "Hello Security (1)";
	}
	
	// localhost:8787/guest/welcome
	@RequestMapping("/guest/welcome")
	public String welcome() {return "guest/welcome1";}
	
	// localhost:8787/member/welcome
	@RequestMapping("/member/welcome")
	public String welcome2() {return "member/welcome2";}
	
	// localhost:8787/admin/welcome
	@RequestMapping("/admin/welcome")
	public String welcome3() {return "admin/welcome3";}
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "security/loginForm";}
	

}