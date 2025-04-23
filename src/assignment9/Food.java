package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	private double x, y;
	
	/**
	 * Creates a new Food at a random location
	 */
	
	
	public Food() {
		this.x = Math.random();
		if(this.x<FOOD_SIZE) {
			this.x= FOOD_SIZE;
		}
		else if(this.x>(1-FOOD_SIZE)) {
			this.x= 1- FOOD_SIZE;
		}
		
		this.y = Math.random();
		if (this.y<FOOD_SIZE) {
			this.y = FOOD_SIZE;
		}
		else if (this.y> (1-FOOD_SIZE)) {
			this.y = 1-FOOD_SIZE;
		}
		
	}
	public double getX(){
		
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	
	/**
	 * Draws the Food
	 */
	public void draw() {
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(getX(), getY(), FOOD_SIZE);
		//FIXME
	}
	
}
