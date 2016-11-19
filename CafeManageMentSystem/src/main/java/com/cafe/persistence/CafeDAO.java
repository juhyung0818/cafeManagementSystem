package com.cafe.persistence;

import java.util.List;

import com.cafe.domain.CafeVO;

public interface CafeDAO {

	public void register(CafeVO cafe) throws Exception;
	public List<CafeVO> cafeList() throws Exception;
	
	public void delete(String cafeName)throws Exception;
}
