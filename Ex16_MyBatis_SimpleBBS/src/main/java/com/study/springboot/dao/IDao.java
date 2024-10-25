package com.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.UserDto;

@Mapper
public interface IDao {
	List<UserDto> getEmployee();
}
