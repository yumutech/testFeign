package com.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="test-booter/testBooter")
@Service
public interface ITestService {
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public void test();
}
