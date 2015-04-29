package com.grumpy.whattodo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;



@Component
public class WhatTodoService implements InitializingBean
{

	private static final Logger LOG = LoggerFactory.getLogger(WhatTodoService.class);

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}


}
