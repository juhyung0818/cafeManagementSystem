package com.cafe.service;

import java.util.List;

import com.cafe.domain.CafeVO;

public interface CafeService {
	
	public void register(CafeVO cafe) throws Exception;
	public List<CafeVO> cafeList() throws Exception;
	
	public void delete(String cafeName) throws Exception;
}
