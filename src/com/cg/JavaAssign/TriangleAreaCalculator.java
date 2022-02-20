package com.cg.JavaAssign;

public class TriangleAreaCalculator{ 
	public static void main(String[] args) {
		Coordinate A = new Coordinate(10, 20); 
		Coordinate B = new Coordinate(10, 60); 
		Coordinate C = new Coordinate(80, 20); 
		System.out.println("Area of triangle: " + Triangle.area(A, B, C));  
		} 
	} 
class Coordinate{ 
	int x; 
	int y; 
	public Coordinate(int x, int y) { 
		this.x = x; 
		this.y = y; 
		} 
	} 
class Triangle { 
	
	public static float area(Coordinate A, Coordinate B, Coordinate C) { 
		float area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f; 
		return Math.abs(area); 
		} 
		
	}
