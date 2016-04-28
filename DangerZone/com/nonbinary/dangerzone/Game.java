package com.nonbinary.dangerzone;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Game
{
	private final static int WINDOW_SIZE_X = 640;
	private final static int WINDOW_SIZE_Y = 480;
	
    public static JFrame app;
    public static Canvas canvas;
    public static BufferStrategy buffer;
    public static Graphics graphics;
    
    public static void init()
    {
    	//Sets java up to use a drawable canvas.
    	
    	//Sets up a Jframe to use a canvas.
    	app = new JFrame();
    	app.setIgnoreRepaint(true);
    	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	//Sets up a canvas to paint to.
    	canvas = new Canvas();
    	canvas.setIgnoreRepaint(true);
    	canvas.setSize(WINDOW_SIZE_X, WINDOW_SIZE_Y);
    	
    	//Puts canvas in app.
    	app.add(canvas);
    	app.pack();
    	app.setVisible(true);
    	
    	//Makes a buffer.
    	canvas.createBufferStrategy(2);
    	buffer = canvas.getBufferStrategy();
    }
	
	public static void render()
	{
		//Gets the buffer we wanna draw on.
		graphics = buffer.getDrawGraphics();
		
		//DRAWING SECTION
		//Makes black background
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		//END DRAWING SECTION
		
		//Displays the drawn buffer. 
		if(!buffer.contentsLost()) buffer.show();
		//Idunno. Looks important.
		if(graphics != null) graphics.dispose();
	}
}
