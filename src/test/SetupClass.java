package test;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class SetupClass extends StateBasedGame 
{

	public SetupClass(String title) 
	{
		super(title);

	}

	


	public static void main(String[] args) throws SlickException 
	{
		
		AppGameContainer app = new AppGameContainer(new SetupClass("Setup Test"));
		
		app.setDisplayMode(800, 600, false);;
		
		app.setShowFPS(false);
		
		app.start(); 
		
		
	}




	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new Start());
		this.addState(new GameState());
		
		
	}
	
}
