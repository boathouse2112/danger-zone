package com.nonbinary.dangerzone;
import java.util.TimerTask;

public class GameLoop extends TimerTask
{
	//This is why we need functions as parameters...
	
	public void run()
	{
		Game.render();
	}
}
