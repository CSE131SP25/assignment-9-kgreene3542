package assignment9;

import edu.princeton.cs.introcs.StdDraw;

public class Grape extends Food{
	public Grape() {
		super();
		
	}
	
	@Override
	public void draw() {
		StdDraw.setPenColor(StdDraw.CYAN);
		StdDraw.filledCircle(getX(), getY(), FOOD_SIZE);
	}

}
