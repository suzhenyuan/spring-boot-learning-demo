package com.suzy.spring.boot.quickstart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.SpringFactoriesLoader;


public class SpringFactoriesLoaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ApplicationListener> loadFactories =  SpringFactoriesLoader.loadFactories(ApplicationListener.class, null);
		loadFactories.forEach(item->System.out.println(item));
		
		
		Map<String, Object> map=new HashMap<String, Object>();
		ClassPathXmlApplicationContext ac =new ClassPathXmlApplicationContext("");
	}

}
