package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	// 클라이언트로부터 요청을 받는 annotation
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "JSP in Gradle";
		// ResponseBody가 없으면 JSP in Gradle(/WEB_INF/views/JSP in Gradle.jsp) 이라는 파일을 찾지만 
		// ResponseBody가 있으면 문자열 자체를 출력함
	}
	
	@RequestMapping("/test1")
	// localhost:8787/test1
	public String test1() {
		return "test1";	// 실제 호출 될 /WEB_INF/views/test1.jsp
	}
	
	@RequestMapping("/test2")
	// localhost:8787/test2
	public String test2() {
		return "sub/test2";	// 실제 호출 될 /WEB_INF/views/sub/test2.jsp
	}
	
	@RequestMapping("/test3")
	// localhost:8787/test3
	public String test3() {
		return "sub/test3"; // 실제 호출 될 /WEB_INF/views/sub/test3.jsp
	}
}
