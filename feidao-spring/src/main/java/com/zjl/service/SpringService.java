package com.zjl.service;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author feidao
 */
@Component
public class SpringService {

	@Resource
	private MyService myService;

	public void query() {
		myService.execute();
	}

}
