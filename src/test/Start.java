package test;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Start extends BasicGameState{

	
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		
		
	}


	public void update(GameContainer container, StateBasedGame sbg, int arg2) throws SlickException {
		if(container.getInput().isKeyPressed(Input.KEY_0)) {
			sbg.enterState(0, new FadeOutTransition(), new FadeInTransition());
		}
		
	}
	
	
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {
	
		g.drawString("Press '0' to shuffle the deck.", 50,50);
	}



	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}

}