package com.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.springboot.dao.ISimpleBbsDao;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@Autowired
	private ISimpleBbsDao dao;
	
	@RequestMapping("/")
	public String root() throws Exception {
		return "redirect:/list";	// 다른 페이지로 보내기 redirect
	}
	
	// bbs리스트
	@RequestMapping("/list")
	public String userlistPage(Model model) {
		model.addAttribute("list", dao.listDao());
		return "/list";
	}
	
	// bbs상세보기
	@RequestMapping("view")
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		model.addAttribute("dto", dao.viewDao(sId));
		return "/view";
	}
	
	// 작성하기 - Form으로 가기
	@RequestMapping("/writeFrom")
	public String writeForm() {
		return "/writeForm";
	}
	
	// 작성하기 - Form에서 controller로
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(HttpServletRequest request, Model model) {
		dao.writeDao(request.getParameter("writer"),
					request.getParameter("title"), 
					request.getParameter("content"));
		return "redirect:/list";
	}
	
	// 삭제하기
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		dao.deleteDao(request.getParameter("id"));
		return "redirect:list";
	}
	
	
	
}
