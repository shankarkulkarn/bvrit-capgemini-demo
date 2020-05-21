package com.cg.demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BFPP implements BeanFactoryPostProcessor
{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		
	    System.out.println(" BFPP CALLED ");
		
	}

}
