package com.study.springboot;

import java.beans.SimpleBeanInfo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.springboot.dao.ISimpleBbsDao;
import com.study.springboot.dto.SimpleBbsDto;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@Autowired
	private ISimpleBbsDao dao;
	
	@RequestMapping("/")
	public String root() throws Exception {
		return "redirect:/list";	// 다른 페이지로 보내기 redirect
	}
	
	//bbs리스트
	@RequestMapping("/list")
	public String userlistPage(Model model){
		List<SimpleBbsDto> list=new ArrayList<>();
		list = dao.listDao();//요청을 dao에게 넘김
		model.addAttribute("list", list);//모델에 저장
		return "list"; //forward
	}
	
	//bbs상세보기  
	@RequestMapping("/view")
	public void view(
//		 HttpServletRequest request, Model model
			SimpleBbsDto dto, Model model
//		@RequestParam("id") String sId를 사용하면 밑의 String sId=...이라고 해줄필요가 없다
// 		@ModelAttribute("dto")로 선언하는 경우, view로 객체가 전달은 되지만 메소드 내부에서 값이 setting되는 과정 없이 전달됨
			){
//		String sId = request.getParameter("id");//"2"
//		SimpleBbsDto dto = dao.viewDao(sId);
		
		dto = dao.viewDao(Integer.toString(dto.getId()));
		
		model.addAttribute("dto", dto);	// 전달객체 전달
		
		// return "view";
		
	}
	
	@RequestMapping("/update/{id}")
	public String updateForm(@PathVariable("id") String id, Model model) {
		System.out.println("id : " + id);
		SimpleBbsDto dto = dao.viewDao(id);
		System.out.println("조회결과: " + dto);
		model.addAttribute("dto", dto);
		
		return "updateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateForm(@ModelAttribute SimpleBbsDto dto) {
		int result = dao.update(dto);
		
		return "redirect:/list";
	}
	
	//작성하기 - Form으로 가기
	@RequestMapping("/writeForm")
	public void view(){}
	
	//작성하기 - Form에서 controller로
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(HttpServletRequest request, Model model){
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
			
		dao.writeDao(writer, title, content);
			
			return "redirect:/list";
	}
	
	// 삭제하기
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request){
		String id = request.getParameter("id"); 
		int result=dao.deleteDao(id);
		System.out.println("삭제된행 수: "+result);
		return "redirect:/list";
	}
	
	
	
}
