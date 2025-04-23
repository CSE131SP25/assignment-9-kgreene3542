package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	
	
	public BodySegment(double x, double y, double size) {
		//FIXME
		this.x = x;
		this.y=y; 
		this.size = size;
		this.color =StdDraw.GREEN;
		
		
		//See ColorUtils for some color options (or choose your own)
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	
	public void addX(double x) {
		this.x +=x;//adding new x to current x
	}
	
	public void addY( double y) {
		this.y+=y;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	
	/**
	 * Draws the segment
	 */
	public void draw() {
		StdDraw.setPenColor(this.color);
		StdDraw.filledCircle(this.x, this.y, this.size);
		
	
	}
	
}
