package com.cafe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cafe.domain.CafeVO;
import com.cafe.domain.ResultVO;
import com.cafe.service.CafeService;

/**
 * Cafeteria Controller class
 * @author YJH
 * 2016.11.08.Tue
 */

@Controller
@RequestMapping("/cafe/*")
public class CafeController {

	private static final Logger logger = LoggerFactory.getLogger(CafeController.class);
	
	@Inject
	private CafeService cafeService;

	@ResponseBody
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ResultVO regist(@RequestBody CafeVO cafe) throws Exception{
		logger.info("register post.......");
		cafeService.register(cafe);
		
		return new ResultVO();
	}

	@ResponseBody
	@RequestMapping(value="/list", method=RequestMethod.POST)
	public ResultVO list() throws Exception{
		logger.info("cafe list post.......");
		List<CafeVO> list= new ArrayList<CafeVO>();
		list=cafeService.cafeList();

		return new ResultVO<>(list);
	}
	
	@ResponseBody
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ResultVO delete(@RequestBody CafeVO cafe) throws Exception{
		logger.info("delete post.......");
		cafeService.delete(cafe.getCafeName());
		
		return new ResultVO();
	}
}
