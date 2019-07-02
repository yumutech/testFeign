package com.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feign.service.ITestService;

@RestController
public class TestController {
	@Autowired
	ITestService testService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public void test() {
		testService.test();
	}
}
