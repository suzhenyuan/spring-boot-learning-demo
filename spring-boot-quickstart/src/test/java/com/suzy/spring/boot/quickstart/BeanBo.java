package com.suzy.spring.boot.quickstart;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.client.RestTemplate;

public class BeanBo implements BeanNameAware,BeanFactoryAware,
ApplicationContextAware, BeanPostProcessor,InitializingBean,DisposableBean{

	@Autowired
	private RestTemplate template;
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
