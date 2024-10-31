package com.study.springboot.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import jakarta.servlet.DispatcherType;

@Configuration
public class WebSecurityConfig {
 // spring 6.1 이상 security 설정
	@Autowired
	public AuthenticationFailureHandler 
	       authenticationFailureHandler;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.csrf(csrf -> csrf.disable())
		    .cors(cors -> cors.disable())
		    .authorizeHttpRequests(request -> request
		    		.dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
		    		.requestMatchers("/").permitAll()
		    		.requestMatchers("/css/**","/js/**","/img/**").permitAll()
		    		.requestMatchers("/guest/**").permitAll()
		    		.requestMatchers("/member/**").hasAnyRole("USER","ADMIN")
		    		.requestMatchers("/admin/**").hasRole("ADMIN")
		    		.anyRequest().authenticated() //
			);
		
		http.formLogin(formLogin 
				       -> formLogin
				       .loginPage("/loginForm")
				       .loginProcessingUrl("/j_spring_security_check")
//				       .failureUrl("/loginError")
				       .failureHandler(authenticationFailureHandler)
				       .usernameParameter("j_username")
				       .passwordParameter("j_password")
				       .permitAll());
		
		http.logout(logout -> logout
				.logoutUrl("/logout") // default
				.logoutSuccessUrl("/") //logout 후 이동할 페이지 /
				.permitAll());
		
		return http.build();
	}
	
	@Bean
	public UserDetailsService users() {
		UserDetails user = User.builder()
				.username("user")
				.password(passwordEncoder().encode("1234"))
				.roles("USER") //ROLE_USER(ROLE_자동추가) 
				.build();
		
		UserDetails admin = User.builder()
				.username("admin")
				.password(passwordEncoder().encode("1234"))
				.roles("USER","ADMIN")//ROLE_USER,ROLE_ADMIN(ROLE_자동추가) 
				.build();
		
		// 메모리에 사용자 정보 저장
		return new InMemoryUserDetailsManager(user,admin);
	   }
	
	//passwordEncoder()
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories
				.createDelegatingPasswordEncoder();
	}
}