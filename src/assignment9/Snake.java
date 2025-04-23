package assignment9;

import java.util.LinkedList;

public class Snake {

	private static final double SEGMENT_SIZE = 0.02;
	private static final double MOVEMENT_SIZE = SEGMENT_SIZE * 1.5;
	private LinkedList<BodySegment> segments;
	private double deltaX;
	private double deltaY;
	
	public Snake() {
		double segment = SEGMENT_SIZE;
		double movement = MOVEMENT_SIZE;
		this.segments = new LinkedList<BodySegment>();
		BodySegment first = new BodySegment(0.5,0.5,SEGMENT_SIZE);
		segments.add(first);
		this.deltaX = 0;
		this.deltaY = 0;
	}
	
	public void changeDirection(int direction) {
		if(direction == 1) { //up
			deltaY = MOVEMENT_SIZE;
			deltaX = 0;
		} else if (direction == 2) { //down
			deltaY = -MOVEMENT_SIZE;
			deltaX = 0;
		} else if (direction == 3) { //left
			deltaY = 0;
			deltaX = -MOVEMENT_SIZE;
		} else if (direction == 4) { //right
			deltaY = 0;
			deltaX = MOVEMENT_SIZE;
		}
	}
	
	/**
	 * Moves the snake by updating the position of each of the segments
	 * based on the current direction of travel
	 */
	public void move() {
		
		for (int i =segments.size()-1; i>0; i--) {
			segments.get(i).setX(segments.get(i-1).getX());
			segments.get(i).setY(segments.get(i-1).getY());
			
			//replacing the body segment from before 
			
		}
		
		segments.get(0).addX(deltaX); 
		segments.get(0).addY(deltaY);
			
		
		
		
	}
	
	/**
	 * Draws the snake by drawing each segment
	 */
	public void draw() {
		for (BodySegment segment : segments) {
			segment.draw();
		}
	
			
		
		//FIXME
	}
	
	/**
	 * The snake attempts to eat the given food, growing if it does so successfully
	 * @param f the food to be eaten
	 * @return true if the snake successfully ate the food
	 */
	public boolean eatFood(Food f) {
		//distance formula between the two. is the food touching the head
		double distance = Math.sqrt(((f.getX() - segments.get(0).getX()) *(f.getX() - segments.get(0).getX()))+ ((f.getY() - segments.get(0).getY()) *(f.getY() - segments.get(0).getY())));
		
		if(distance< SEGMENT_SIZE) {
		BodySegment tail =  segments.get(segments.size()-1); //getting specific body segment
		int growBy = (f instanceof Grape) ? 2:1;//from chat gpt, say that if the f called is a graoe it will grow by two on the tail instead of 1
		
		for( int i =0; i< growBy; i++) {
		BodySegment addition = new BodySegment( tail.getX(), tail.getY(), SEGMENT_SIZE);
			segments.add(addition);
		}
			return true;
		}
		else {
		return false;
		}
	}
	
	/**
	 * Returns true if the head of the snake is in bounds
	 * @return whether or not the head is in the bounds of the window
	 */
	public boolean isInbounds() {
		if (   segments.get(0).getX() > 0 && segments.get(0).getX() < 1 && segments.get(0).getY() > 0 && segments.get(0).getY() <1) {
			return true;
		}else {
			return false;
		}
				
		
	}
}
