package test;

import java.util.Arrays;
import java.util.stream.IntStream;

//import java.util.ArrayList;
//import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
//import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;



public class GameState extends BasicGameState{

//	private ArrayList<Circle> balls;
//	private Circle mouseBall; 
//	private int timePassed;
	
	private int[] deck = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51}; 
	private int[] deck2 = {}; 
	private String[] deck3 = {}; 
	private String[] dealtStr = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "TH", "JH", "QH", "KH", "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "TC", "JC", "QC", "KC", "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD", "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS" } ; 
	private String[] spaceOne = new String[1];
	private String[] spaceTwo = new String[2];
	private String[] spaceThree = new String[3];
	private String[] spaceFour = new String[4];
	private String[] spaceFive = new String[5];
	private String[] spaceSix = new String[6];
	private String[] spaceSeven = new String[7];
	private String[] spaceExtra = new String[24];

	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
//		balls = new ArrayList<Circle>();
//		mouseBall = new Circle(0,0, 20);
//		timePassed = 0;

		int i = 0;
		while (i < deck.length) {
	    	int randomNum = (int)(Math.random() * 52);
	    	int place = deck[randomNum];
	    	boolean result = IntStream.of(deck2).anyMatch(x -> x == place);
	    	if(result) {
	    		
	    	}
	    	else {
	    		deck2 = Arrays.copyOf(deck2, deck2.length + 1);
	    		deck2[i] = place;
	    		i++;
	    	}
	    	
	    	
		}	
	    

	    	
	    
	    
	}



	public void update(GameContainer container, StateBasedGame sbg, int delta) 
			throws SlickException {
		if(container.getInput().isKeyPressed(Input.KEY_1)) {
			sbg.enterState(1, new FadeOutTransition(), new FadeInTransition());
		}
//		mouseBall.setCenterX(container.getInput().getMouseX());
//		mouseBall.setCenterY(container.getInput().getMouseY());
//		timePassed += delta;
//		if(timePassed > 500) {
//			timePassed = 0;
//			balls.add(new Circle(200+random.nextInt(400),0,10));	
//		}
//		for(Circle c : balls) {
//			c.setCenterY((float) (c.getCenterY()+(0.33)));
//		}
		
	}
	
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {

					
		int spacer = 0;
		for (int t=0 ; t<26 ; t++ )
		{
			deck3 = Arrays.copyOf(deck3, deck3.length + 1);
			deck3[t] = dealtStr[deck2[t]];
			g.drawString(deck3[t], 50+spacer, 50);
			spacer += 25;
		}
		spacer = 0 ;
		for (int u=26 ; u<52 ; u++ )
		{
			deck3 = Arrays.copyOf(deck3, deck3.length + 1);
			deck3[u] = dealtStr[deck2[u]];
			g.drawString(deck3[u], 50+spacer, 75);
			spacer += 25;
		}

		spaceOne[0] = deck3[0];
		
		spaceTwo[0] = deck3[1];
		spaceTwo[1] = deck3[7]; 
		
		spaceThree[0] = deck3[2]; 
		spaceThree[1] = deck3[8];
		spaceThree[2] = deck3[13];
				
		spaceFour[0] = deck3[3];
		spaceFour[1] = deck3[9];
		spaceFour[2] = deck3[14];
		spaceFour[3] = deck3[18];
		
		spaceFive[0] = deck3[4];
		spaceFive[1] = deck3[10];
		spaceFive[2] = deck3[15];
		spaceFive[3] = deck3[19];
		spaceFive[4] = deck3[22];
		
		spaceSix[0] = deck3[5];
		spaceSix[1] = deck3[11];
		spaceSix[2] = deck3[16];
		spaceSix[3] = deck3[20];
		spaceSix[4] = deck3[23];
		spaceSix[5] = deck3[25];
		
		spaceSeven[0] = deck3[6];
		spaceSeven[1] = deck3[12];
		spaceSeven[2] = deck3[17];
		spaceSeven[3] = deck3[21];
		spaceSeven[4] = deck3[24];
		spaceSeven[5] = deck3[26];
		spaceSeven[6] = deck3[27];
				
		for (int extra = 0; extra<24 ; extra++)
		{
			spaceExtra[extra] = deck3[extra+28];			
			
		}
		
		
		boolean spaceOne0show = true ;		
		if (spaceOne0show == true) {
		g.drawString(spaceOne[0], 50, 300);
		}
		
		
		boolean spaceTwo1show = true; 		
		if (spaceTwo1show == true) {
		g.drawString(spaceTwo[1], 100, 300);
		}
		boolean spaceTwo0show = false; 
		if (spaceTwo0show == true) {
		g.drawString(spaceTwo[0], 100, 300);
		}
		
		
		boolean spaceThree2show = true;
		if (spaceThree2show == true) {
		g.drawString(spaceThree[2], 150, 300);
		}
		boolean spaceThree1show = false;
		if (spaceThree1show == true) {
		g.drawString(spaceThree[1], 150, 300);
		}
		boolean spaceThree0show = false;
		if (spaceThree0show == true) {
		g.drawString(spaceThree[0], 150, 300);
		}
		
		
		boolean spaceFour3show = true;
		if (spaceFour3show == true) {
		g.drawString(spaceFour[3], 200, 300);
		}
		boolean spaceFour2show = false;
		if (spaceFour2show == true) {
		g.drawString(spaceFour[2], 200, 300);
		}
		boolean spaceFour1show = false;
		if (spaceFour1show == true) {
		g.drawString(spaceFour[1], 200, 300);
		}
		boolean spaceFour0show = false; 
		if (spaceFour0show == true) {
		g.drawString(spaceFour[0], 200, 300);
		}
		
		
		boolean spaceFive4show = true; 
		if (spaceFive4show == true) {
		g.drawString(spaceFive[4], 250, 300);
		}
		boolean spaceFive3show = false; 
		if (spaceFive3show == true) {
		g.drawString(spaceFive[3], 250, 300);
		}
		boolean spaceFive2show = false; 
		if (spaceFive2show == true) {
		g.drawString(spaceFive[2], 250, 300);
		}
		boolean spaceFive1show = false; 
		if (spaceFive1show == true) {
		g.drawString(spaceFive[1], 250, 300);
		}
		boolean spaceFive0show = false; 
		if (spaceFive0show == true) {
		g.drawString(spaceFive[0], 250, 300);
		}
		
		
		boolean spaceSix5show = true; 
		if (spaceSix5show == true) {
		g.drawString(spaceSix[5], 300, 300);
		}
		boolean spaceSix4show = false; 
		if (spaceSix4show == true) {
		g.drawString(spaceSix[4], 300, 300);
		}
		boolean spaceSix3show = false; 
		if (spaceSix3show == true) {
		g.drawString(spaceSix[3], 300, 300);
		}
		boolean spaceSix2show = false; 
		if (spaceSix2show == true) {
		g.drawString(spaceSix[2], 300, 300);
		}
		boolean spaceSix1show = false; 
		if (spaceSix1show == true) {
		g.drawString(spaceSix[1], 300, 300);
		}		
		boolean spaceSix0show = false; 
		if (spaceSix0show == true) {
		g.drawString(spaceSix[0], 300, 300);
		}
		
		boolean spaceSeven6show = true; 
		if (spaceSeven6show == true) {
		g.drawString(spaceSeven[6], 350, 300);
		}
		boolean spaceSeven5show = false; 
		if (spaceSeven5show == true) {
		g.drawString(spaceSeven[5], 350, 300);
		}
		boolean spaceSeven4show = false; 
		if (spaceSeven4show == true) {
		g.drawString(spaceSeven[4], 350, 300);
		}
		boolean spaceSeven3show = false; 
		if (spaceSeven3show == true) {
		g.drawString(spaceSeven[3], 350, 300);
		}
		boolean spaceSeven2show = false; 
		if (spaceSeven2show == true) {
		g.drawString(spaceSeven[2], 350, 300);
		}
		boolean spaceSeven1show = false; 
		if (spaceSeven1show == true) {
		g.drawString(spaceSeven[1], 350, 300);
		}
		boolean spaceSeven0show = false; 
		if (spaceSeven0show == true) {
		g.drawString(spaceSeven[0], 350, 300);
		}
		
		g.drawString("Extra Cards:", 50, 425);
		
		boolean extraSpace1 = true; 
		boolean extraSpace2 = false; 
		boolean extraSpace3 = false;  
		boolean extraSpace4 = false;  
		boolean extraSpace5 = false;  
		boolean extraSpace6 = false;  
		boolean extraSpace7 = false; 
		boolean extraSpace8 = false; 
		if (extraSpace1 == true) {
			int space2 = 0;
			for (int x=0; x<3; x++) {
				g.drawString(spaceExtra[x], 50+space2, 450);
				space2 += 25;
			}
		}
		if (extraSpace2 == true) {
			int space2 = 0;
			for (int x=3; x<6; x++) {
				g.drawString(spaceExtra[x], 50+space2, 450);
				space2 += 25;
			}
		}
		if (extraSpace3 == true) {
			int space2 = 0;
			for (int x=6; x<9; x++) {
				g.drawString(spaceExtra[x], 50+space2, 450);
				space2 += 25;
			}
		}
		if (extraSpace4 == true) {
			int space2 = 0;
			for (int x=9; x<12; x++) {
				g.drawString(spaceExtra[x], 50+space2, 450);
				space2 += 25;
			}
		}
		if (extraSpace5 == true) {
			int space2 = 0;
			for (int x=12; x<15; x++) {
				g.drawString(spaceExtra[x], 50+space2, 450);
				space2 += 25;
			}
		}
		if (extraSpace6 == true) {
			int space2 = 0;
			for (int x=15; x<18; x++) {
				g.drawString(spaceExtra[x], 50+space2, 450);
				space2 += 25;
			}
		}
		if (extraSpace7 == true) {
			int space2 = 0;
			for (int x=18; x<21; x++) {
				g.drawString(spaceExtra[x], 50+space2, 450);
				space2 += 25;
			}
		}
		if (extraSpace2 == true) {
			int space2 = 0;
			for (int x=21; x<24; x++) {
				g.drawString(spaceExtra[x], 50+space2, 450);
				space2 += 25;
			}
		}
		g.setColor(Color.yellow);
//		g.fill(mouseBall);

//		g.setColor(Color.red);
//		for(Circle c : balls) {
//			g.fill(c);
//		}
		
		
		
	}



	@Override
	public int getID() {

		return 0;
	}

}
