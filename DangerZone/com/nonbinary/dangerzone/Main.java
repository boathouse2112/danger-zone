package com.nonbinary.dangerzone;
import java.util.Timer;

/*Name:
 *Date:
 *Period:
 *Teacher:
 *Description:
 */

public class Main
{
	//ms wait for ~60 fps
    private final static int WAIT_TIME = 17;
    
    public static void main(String[] args)
    {
    	Game.init();
    	
    	//begins game loop
    	Timer gameLoop = new Timer();
    	gameLoop.scheduleAtFixedRate(new GameLoop(), 0, WAIT_TIME);
    }
}
