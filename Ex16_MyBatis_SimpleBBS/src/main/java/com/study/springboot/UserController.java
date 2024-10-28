package com.study.springboot;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.dao.IDao;
import com.study.springboot.dto.UserDto;

@Controller
public class UserController {

	@Autowired
	private IDao dao;
	
	@RequestMapping("/employees")
	public String userlistPage(Model model) {
		List<UserDto> list = dao.getEmployee();
		for(UserDto dto : list) {
			System.out.println(dto);
		}
		model.addAttribute("employees", list);
		return "employeelist";
	}
	
	@GetMapping("/employee/{empno}")
	public String empInfo(@PathVariable("empno") String empno, Model model) {
		System.out.println("empno : " + empno);
		// dao로 empno에 해당하는 정보를 요청
		UserDto emp = dao.getEmpInfo(empno);
		
		System.out.println("empInfo : " + emp);
		model.addAttribute("empInfo", emp);
		return "employee";
	}
}
