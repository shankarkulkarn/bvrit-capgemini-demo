package com.cg.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.demo.bean.Point;
import com.cg.demo.bean.Triangle;

@Configuration
public class BeanConfiguration {

	@Bean
	public Point getPoint()
	{
		Point  point = new Point();
		point.setX(100);
		point.setY(200);
		return point;
	}
	
	@Bean
	public Triangle  getTriangle()
	{
		  Triangle  triangle = new Triangle();
		  triangle.setPoint1(getPoint());
		  return triangle;
	}
}
