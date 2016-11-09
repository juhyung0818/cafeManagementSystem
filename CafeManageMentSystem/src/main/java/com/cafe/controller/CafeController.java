package com.cafe.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe.service.CafeService;

/**
 * Cafeteria Controller class
 * @author YJH
 * 2016.11.08.Tue
 */

@Controller
@RequestMapping("/cafe")
public class CafeController {

	//use log4j
	private static final Logger logger = LoggerFactory.getLogger(CafeController.class);
	
	@Inject
	private CafeService cafeService;

	
}
