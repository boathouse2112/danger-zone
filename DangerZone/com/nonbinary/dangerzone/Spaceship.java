package com.nonbinary.dangerzone;

import java.awt.Color;
import java.awt.Graphics;

public class Spaceship extends GameObject
{
	public void render(Graphics graphics)
	{
		graphics.setColor(Color.yellow);
		graphics.fillRect(0, 0, 640, 480);
	}
}
