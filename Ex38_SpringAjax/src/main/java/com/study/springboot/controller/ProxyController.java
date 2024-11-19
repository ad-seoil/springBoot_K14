package com.study.springboot.controller;

import java.nio.charset.StandardCharsets;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProxyController {

	@GetMapping("/rss")
	public ResponseEntity<String> getRssFeed() {
		String rssUrl = "http://myhome.chosun.com/rss/www_section_rss.xml";
		
		RestTemplate restTemplate = new RestTemplate();
		
		// utf-8 한글 인코딩 설정
		restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));
		
		String rssData = restTemplate.getForObject(rssUrl, String.class);
		
		return ResponseEntity.ok(rssData);
		// rssData 전달.head에 200 ok 추가
	}
}
