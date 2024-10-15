package com.study.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/") //Get요청이 default임
	public @ResponseBody String root() {
		return "Model & View";
	}
	
	@GetMapping("/test1") //spring 4.3이후 도입
	public String test1() {
		return "test1"; // /WEB-INF/views/test1.jsp
	}
	
	//value와 method방식 지정
	@RequestMapping(value = "/test2",method=RequestMethod.GET)
	public String test2() {
		return "myView"; //  /WEB-INF/views/test2.jsp
	}
	
	@GetMapping("/mv")
	public ModelAndView test3(Model model) {
		ModelAndView mv = new ModelAndView();
		
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		mv.addObject("lists", list);
		mv.addObject("ObjectTest", "테스트입니다");
		mv.addObject("name","홍길동");
		mv.setViewName("view/MyView");
		
		return mv;

	}
}
