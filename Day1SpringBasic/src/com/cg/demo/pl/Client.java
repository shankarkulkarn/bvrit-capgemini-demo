package com.cg.demo.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.demo.bean.Triangle;

public class Client {

	public static void main(String[] args) {
		
	ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");	
	
    Triangle  triangle1 = (Triangle) ctx.getBean("trg");
		   
    //Triangle  triangle2 = ctx.getBean(Triangle.class);
    
    Triangle   t3 =  ctx.getBean(Triangle.class,"sample");
    
    if(triangle1==t3)
    {
    	System.out.println(" Singleton Design Pattern ");
    }
    else
    {
    	System.out.println(" Prototype Design Pattern ");
    }
    triangle1.draw();

	}

}
