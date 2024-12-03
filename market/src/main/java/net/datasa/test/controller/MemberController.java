package net.datasa.test.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.test.domain.dto.MemberDTO;
import net.datasa.test.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 회원 관련 콘트롤러
 */

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("member")
public class MemberController {
	
	// 회원정보 처리 서비스
	private final MemberService memberService;

   @GetMapping("loginForm")
   public String loginForm() {
	   return "member/loginForm";
   }
   
   @GetMapping("join")
   public String joinForm() {
	   return "member/joinForm"; // templates/member/joinForm
   }

   @PostMapping("join")
   public String join(MemberDTO member) {
	   memberService.join(member);
	   return "redirect:/";
   }
	
}
