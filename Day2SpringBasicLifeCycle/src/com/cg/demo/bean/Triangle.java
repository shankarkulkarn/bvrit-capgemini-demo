package com.cg.demo.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle {

	
	public  void draw()
	{
		System.out.println(" Triangle Draw ");
	}

	
	public void destroy() throws Exception {
		System.out.println(" Bean  Destroy method called ");
		
	}

	
	public void init() throws Exception {
		
		System.out.println(" Triangle Bean  init method called ");
		
	}
	
}
