package assignment9;

import java.awt.event.KeyEvent;

import edu.princeton.cs.introcs.StdDraw;

public class Game {
	private Food f1;
	private Snake s1;
	
	public Game() {
		StdDraw.enableDoubleBuffering();
		
		Snake s1 = new Snake();
		Food f1 = new Food();
		
		this.f1= f1;
		this.s1 = s1;
		
		
		
		
		
		
	}
	private Food generateRandomFood() {
		if(Math.random()<0.1) {
			return new Grape();
			
		}else {
		return new Food();
		}
	}
	
	public void play() {
		while (s1.isInbounds()) { 
			int dir = getKeypress();
			s1.changeDirection(dir);
			s1.move();
			if(s1.eatFood(f1)) {	
				f1 = generateRandomFood();
				
			}
			updateDrawing();
			
			
			
			
			
			/*
			 * 1. Pass direction to your snake
			 * 2. Tell the snake to move
			 * 3. If the food has been eaten, make a new one
			 * 4. Update the drawing
			 */
		}
	}
	
	private int getKeypress() {
		if(StdDraw.isKeyPressed(KeyEvent.VK_W)) {
			return 1;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
			return 2;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
			return 3;
		} else if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
			return 4;
		} else {
			return -1;
		}
	}
	
	/**
	 * Clears the screen, draws the snake and food, pauses, and shows the content
	 */
	private void updateDrawing() {
		StdDraw.clear();
		f1.draw();
		s1.draw();
		StdDraw.pause(50);
		StdDraw.show();
		
		
		
		
		
		//FIXME
		
		/*
		 * 1. Clear screen
		 * 2. Draw snake and food
		 * 3. Pause (50 ms is good)
		 * 4. Show
		 */
	}
	
	public static void main(String[] args) {
		Game g = new Game();
		g.play();
	}
}
