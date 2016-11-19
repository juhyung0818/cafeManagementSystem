package com.cafe.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cafe.domain.CafeVO;
import com.cafe.persistence.CafeDAO;

@Service
public class CafeServiceImpl implements CafeService{

	@Inject
	private CafeDAO cafeDao;
	
	@Override
	public void register(CafeVO cafe) throws Exception {
		cafeDao.register(cafe);
	}

	@Override
	public List<CafeVO> cafeList() throws Exception {
		return cafeDao.cafeList();
	}

	@Override
	public void delete(String cafeName) throws Exception {
		cafeDao.delete(cafeName);
	}

}
