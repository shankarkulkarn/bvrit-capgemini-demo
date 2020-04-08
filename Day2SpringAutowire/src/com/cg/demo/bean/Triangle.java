package com.cg.demo.bean;

public class Triangle {

	Point   point1;
	
	
	
	public Triangle(Point point1) {
		super();
		this.point1 = point1;
		System.out.println(" Constructor injection ");
	}


	
	public Triangle() {
		super();
	}



	public Point getPoint1() {
		return point1;
	}


	public void setPoint1(Point point1) {
		this.point1 = point1;
		System.out.println(" Setter Injection ");
	}


	public void draw()
	{
		System.out.println("Triangle Draw");
		System.out.println("Point1  x = "+point1.getX()+"  y= "+point1.getY());
	}
}
