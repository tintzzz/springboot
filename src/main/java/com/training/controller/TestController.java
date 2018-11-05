package com.training.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.exception.ProductNotFound;


@RestController
public class TestController {

	@Autowired
	RestTemplate template;
	
	@Value("${traning.name}")
	String name;
	
	private static final Logger logger =LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value="/test/{flag}",method=RequestMethod.GET)
	public String getData(@PathVariable("flag") boolean flag){
		System.out.println("welcome "+name);
		logger.info("tintu started");
		logger.error("error");
		if(!flag)
			throw new ProductNotFound();
//		String str=template.exchange(requestEntity, responseType)
		return "success";
	}
}
