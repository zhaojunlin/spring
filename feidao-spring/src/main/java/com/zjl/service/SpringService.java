package com.zjl.service;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author feidao
 */
@Component
public class SpringService {

	private MyService myService;

	public SpringService(MyService myService) {
		this.myService = myService;
	}

	public void query() {
		System.out.println(myService);
		myService.execute();
	}

}
