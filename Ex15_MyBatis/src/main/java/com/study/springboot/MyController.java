package com.study.springboot;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.IMyUserDAO;
import com.study.springboot.jdbc.MyUserDTO;

@Controller
public class MyController {

	@Autowired
	private IMyUserDAO userDAO;
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "MyBatis 사용하기";
	}
	
	@RequestMapping("/user")
	public String userlistPage(Model model) {
		ArrayList<MyUserDTO> users = userDAO.getUser();
		model.addAttribute("users", users);
		return "userlist";
	}
}
