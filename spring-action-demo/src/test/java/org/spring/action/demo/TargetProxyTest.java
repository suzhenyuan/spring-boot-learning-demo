package org.spring.action.demo;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.action.demo.validate.RequestTarget;
import org.spring.action.demo.validate.validateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=validateConfig.class)
public class TargetProxyTest {

	@Autowired
	RequestTarget requestTarget;
	@Test
	public void test() {
		Map<String,Object>request = new HashMap<String, Object>();
		requestTarget.doAround();
		
		System.out.println(request.toString());
		System.out.println("done");
	}

}
