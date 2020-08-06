package com.satya.service;

import com.satya.aspect.Loggable;
import com.satya.dto.Circle;
import com.satya.dto.Triangle;

public class AOPService {

	private Circle circle;
	private Triangle triangle;
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
