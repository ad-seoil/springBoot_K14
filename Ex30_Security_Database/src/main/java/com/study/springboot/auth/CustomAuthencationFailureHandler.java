package com.study.springboot.auth;

import java.io.IOException;

import javax.security.auth.login.CredentialExpiredException;

import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
public class CustomAuthencationFailureHandler 
            implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, 
			                           HttpServletResponse response,
			                           AuthenticationException exception) throws IOException, ServletException {
	String loginId = request.getParameter("j_username");
	String errormsg = "";
	
	if(exception instanceof BadCredentialsException ) {
		errormsg ="아이디나 비밀번호가 맞지 않습니다. 다시 확인해주세요.";
	}else if(exception instanceof InternalAuthenticationServiceException ) {
		errormsg ="아이디나 비밀번호가 맞지 않습니다. 다시 확인해주세요.";
	}else if(exception instanceof DisabledException ) {
		errormsg ="계정이 비활성화되었습니다. 관리자에게 문의하세요.";
	}else if(exception instanceof CredentialsExpiredException) {
		errormsg = "비밀번호 유효기간이 만료 되었습니다. 관리자에게 문의하세요.";
	}
    
	//loginForm페이지로 이동할 값을 request객체에 저장
	 request.setAttribute("username", loginId);
	 request.setAttribute("error_message", errormsg);
	 
	 //request와 response객체 와 함께 /loginForm으로 이동
	 request.getRequestDispatcher("/loginForm?error=true")
	        .forward(request, response);
	 
	}

}