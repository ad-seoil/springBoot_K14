package com.study.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.springboot.dto.SimpleBbsDto;

@Repository
public class SimpleBbsDao implements ISimpleBbsDao{

	@Autowired
	private JdbcTemplate template;
	
//	autowired를 쓰면 결합도는 낮아지지만 다른 값이 들어갈 확률이 높아지기 때문에 생성자로 막는 걸 추천함
//	private final JdbcTemplate template;	
//	
//	public SimpleBbsDao(JdbcTemplate template) {
//		super();
//		this.template = template;
//	}

	@Override
	public List<SimpleBbsDto> listDao() {
		System.out.println("listDao()");
		
		String query = "select * from simple_bbs order by id desc";
		List<SimpleBbsDto> dtos = template.query(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		
		return dtos;
	}

	@Override
	public SimpleBbsDto viewDao(String id) {
		System.out.println("viewDao()");
		//Statement
		String query = "select * from simple_bbs where id="+id;
		System.out.println("쿼리문:"+query);
		SimpleBbsDto dto=template.queryForObject(query, new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		return dto;
	}

	@Override
	public int writeDao(String writer, String title, String content) {
		System.out.println("writeDao()");
		String query = "insert into simple_bbs(id, writer, title, content) "+ " values(simple_bbs_seq.nextval,?,?,?)";
		//update()메소드 실행결과 값은 insert된 행의 수(1)
		int result=template.update(query,writer, title, content );
		return result;
	}

	@Override
	public int deleteDao(String id) {
		System.out.println("deleteDao()");
		// PreparedStatement문
		String query="delete simple_bbs where id = ?";
		//wrapper클래스 Integer.parseInt(id) 역할: "3"(String) -> 3(int)
		int result=template.update(query, Integer.parseInt(id) );
		return result;
	}

	@Override
	public int update(SimpleBbsDto dto) {
		System.out.println("updateDao()");
		// 1.update문으로 수정
		String query = "update simple_bbs " + 
						" set writer = ?, title =?, content =?"+
						" where id = ?";
		// 2. dto로부터 하나씩 끄집어내서 writer, title, content, id에 매핑
		String writer = dto.getWriter();
		String title = dto.getTitle();
		String content = dto.getContent();
		int id = dto.getId();
		
		int result=template.update(query,writer, title, content, id);
		System.out.println("결과 : " + result);
		
		return result;
	}
}
