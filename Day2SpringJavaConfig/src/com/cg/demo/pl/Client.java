package com.cg.demo.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.demo.bean.Triangle;
import com.cg.demo.config.BeanConfiguration;

public class Client {

	public static void main(String[] args) {
		
		  ApplicationContext  ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		  Triangle  triangle  = (Triangle)ctx.getBean("trg1");
		  triangle.draw();
		 
		  
	}

}
