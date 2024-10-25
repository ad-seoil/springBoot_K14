package com.study.springboot.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.study.springboot.dto.SimpleBbsDto;

@Mapper
public interface ISimpleBbsDao {
	
	public List<SimpleBbsDto> listDao();
	public SimpleBbsDto viewDao(String id);
//	public int writeDao(@Param("writer") String writer,
//						@Param("title") String title, 
//						@Param("content") String content);
	public int writeDao(@Param("writer") String writer,
						@Param("title") String title, 
						@Param("content") String content);
	public int deleteDao(String id);
	public int update(SimpleBbsDto dto);
	public int writeDao2(Map<String, String> map);
	
}
