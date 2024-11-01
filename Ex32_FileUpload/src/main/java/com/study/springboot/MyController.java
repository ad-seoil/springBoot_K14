package com.study.springboot;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@RequestMapping("/")
	public String root() throws Exception {
		return "FileUpload";
	}
	
	@RequestMapping("/uploadForm")
	public String uploadForm() {
		return "FileUpload/fileForm";
	}
	
	@RequestMapping("/uploadOk")
	public @ResponseBody String uploadOk(HttpServletRequest request) {
		JSONObject obj = new JSONObject();
		return null;
	}
	
	
}
