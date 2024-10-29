package com.study.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.dao.ISimpleBbsDao;
import com.study.springboot.dto.SimpleBbsDto;

@Service
public class SimpleBbsServiceImpl implements ISimpleBbsService {

	@Autowired
	private ISimpleBbsDao dao;
	
	@Override
	public List<SimpleBbsDto> list() {
		return dao.listDao();
	}

	@Override
	public SimpleBbsDto view(String id) {
		// TODO Auto-generated method stub
		return dao.viewDao(id);
	}

	@Override
	public int write(Map<String, String> map) {
		int nResult = dao.writeDao2(map);
		return nResult;
	}

	@Override
	public int delete(String id) {
		int nResult = dao.deleteDao(id);
		return nResult;
	}

	@Override
	public int count() {
		return dao.articleCount();
	}

	@Override
	public int update(SimpleBbsDto dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}

}
