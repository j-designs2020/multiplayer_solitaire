package test;


import java.util.Arrays;

import java.util.stream.IntStream;

import org.lwjgl.input.Mouse;

//import java.util.ArrayList;
//import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
//import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;




public class GameState extends BasicGameState{
	
	
	

	//SET CARD IMAGE VARIABLES
	public Image img_AH = null ;
	public Image img_2H = null ; 
	public Image img_3H = null ; 
	public Image img_4H = null ; 
	public Image img_5H = null ; 
	public Image img_6H = null ; 
	public Image img_7H = null ; 
	public Image img_8H = null ; 
	public Image img_9H = null ; 
	public Image img_TH = null ; 
	public Image img_JH = null ; 
	public Image img_QH = null ; 
	public Image img_KH = null ; 
	
	public Image img_AC = null ; 
	public Image img_2C = null ; 
	public Image img_3C = null ; 
	public Image img_4C = null ; 
	public Image img_5C = null ; 
	public Image img_6C = null ; 
	public Image img_7C = null ; 
	public Image img_8C = null ; 
	public Image img_9C = null ; 
	public Image img_TC = null ; 
	public Image img_JC = null ; 
	public Image img_QC = null ; 
	public Image img_KC = null ; 
	
	
	public Image img_AD = null ; 
	public Image img_2D = null ; 
	public Image img_3D = null ; 
	public Image img_4D = null ; 
	public Image img_5D = null ; 
	public Image img_6D = null ; 
	public Image img_7D = null ; 
	public Image img_8D = null ; 
	public Image img_9D = null ; 
	public Image img_TD = null ; 
	public Image img_JD = null ; 
	public Image img_QD = null ; 
	public Image img_KD = null ; 
	
	
	public Image img_AS = null ; 
	public Image img_2S = null ; 
	public Image img_3S = null ; 
	public Image img_4S = null ; 
	public Image img_5S = null ; 
	public Image img_6S = null ; 
	public Image img_7S = null ; 
	public Image img_8S = null ; 
	public Image img_9S = null ; 
	public Image img_TS = null ; 
	public Image img_JS = null ; 
	public Image img_QS = null ; 
	public Image img_KS = null ; 
	
	public Image joker = null ; 
	
	//END SET CARD IMAGE VARIABLES
	
	

	//WHAT CARD WILL BE DRAGGED WITH MOUSE
	public Image mouseImage = null; 
	public Image mouseImage2 = null;
	public Image mouseImage3 = null; 
	//END DRAGGED WITH MOUSE
	

	
	//DEFINE THE DECK
	private int[] deck = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51}; 
	private int[] deck2 = {}; 
	private String[] deck3 = {}; 
	private String[] dealtStr = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "TH", "JH", "QH", "KH", "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "TC", "JC", "QC", "KC", "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "TD", "JD", "QD", "KD", "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "TS", "JS", "QS", "KS" } ;  
	//END DEFINE DECK
	
	//DEFINE THE SPACES FOR THE DRAWN CARDS
	private Image[] spaceOne = new Image[1];
	private Image[] spaceTwo = new Image[2];
	private Image[] spaceThree = new Image[3];
	private Image[] spaceFour = new Image[4];
	private Image[] spaceFive = new Image[5];
	private Image[] spaceSix = new Image[6];
	private Image[] spaceSeven = new Image[7];
	private Image[] spaceExtra = new Image[24];
	//END DEFINED SPACES

	
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {


		//SET IMAGE TO MOUSE
		mouseImage = new Image("images/cards/ace_of_hearts.png");
		mouseImage2 = mouseImage.copy(); 
		mouseImage3 = mouseImage.copy();
		//END SET IMAGE TO MOUSE
			
		//SET IMAGES TO CARD VARIABLES (DISPLAY ONE IMAGE MULTIPLE LAYERS?)
		img_AH = new Image("images/cards/ace_of_hearts.png");
		img_2H = new Image("images/cards/2_of_hearts.png");
		img_3H = new Image("images/cards/3_of_hearts.png");
		img_4H = new Image("images/cards/4_of_hearts.png");
		img_5H = new Image("images/cards/5_of_hearts.png");
		img_6H = new Image("images/cards/6_of_hearts.png");
		img_7H = new Image("images/cards/7_of_hearts.png");
		img_8H = new Image("images/cards/8_of_hearts.png");
		img_9H = new Image("images/cards/9_of_hearts.png");
		img_TH = new Image("images/cards/10_of_hearts.png");
		img_JH = new Image("images/cards/jack_of_hearts.png");
		img_QH = new Image("images/cards/queen_of_hearts.png");
		img_KH = new Image("images/cards/king_of_hearts.png");
		
		img_AC = new Image("images/cards/ace_of_clubs.png");
		img_2C = new Image("images/cards/2_of_clubs.png");
		img_3C = new Image("images/cards/3_of_clubs.png");
		img_4C = new Image("images/cards/4_of_clubs.png");
		img_5C = new Image("images/cards/5_of_clubs.png");
		img_6C = new Image("images/cards/6_of_clubs.png");
		img_7C = new Image("images/cards/7_of_clubs.png");
		img_8C = new Image("images/cards/8_of_clubs.png");
		img_9C = new Image("images/cards/9_of_clubs.png");
		img_TC = new Image("images/cards/10_of_clubs.png");
		img_JC = new Image("images/cards/jack_of_clubs.png");
		img_QC = new Image("images/cards/queen_of_clubs.png");
		img_KC = new Image("images/cards/king_of_clubs.png");
		
		img_AD = new Image("images/cards/ace_of_diamonds.png");
		img_2D = new Image("images/cards/2_of_diamonds.png");
		img_3D = new Image("images/cards/3_of_diamonds.png");
		img_4D = new Image("images/cards/4_of_diamonds.png");
		img_5D = new Image("images/cards/5_of_diamonds.png");
		img_6D = new Image("images/cards/6_of_diamonds.png");
		img_7D = new Image("images/cards/7_of_diamonds.png");
		img_8D = new Image("images/cards/8_of_diamonds.png");
		img_9D = new Image("images/cards/9_of_diamonds.png");
		img_TD = new Image("images/cards/10_of_diamonds.png");
		img_JD = new Image("images/cards/jack_of_diamonds.png");
		img_QD = new Image("images/cards/queen_of_diamonds.png");
		img_KD = new Image("images/cards/king_of_diamonds.png");
		
		img_AS = new Image("images/cards/ace_of_spades2.png");
		img_2S = new Image("images/cards/2_of_spades.png");
		img_3S = new Image("images/cards/3_of_spades.png");
		img_4S = new Image("images/cards/4_of_spades.png");
		img_5S = new Image("images/cards/5_of_spades.png");
		img_6S = new Image("images/cards/6_of_spades.png");
		img_7S = new Image("images/cards/7_of_spades.png");
		img_8S = new Image("images/cards/8_of_spades.png");
		img_9S = new Image("images/cards/9_of_spades.png");
		img_TS = new Image("images/cards/10_of_spades.png");
		img_JS = new Image("images/cards/jack_of_spades.png");
		img_QS = new Image("images/cards/queen_of_spades.png");
		img_KS = new Image("images/cards/king_of_spades.png");
		
		
		joker = new Image("images/cards/black_joker.png");

		//END IMAGES TO CARD VARIABLES
		
		
		//SHUFFLE DECK
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
	    //END SHUFFLE DECK

	    	
	    
	    
	}



	public void update(GameContainer container, StateBasedGame sbg, int delta) 
			throws SlickException {
		if(container.getInput().isKeyPressed(Input.KEY_1)) {
			sbg.enterState(1, new FadeOutTransition(), new FadeInTransition());
		}

		//GRID FOR PLAYERS CARDS
		int[] spaceOneGrid = {50,225,110,138}; 
		int[] spaceTwoGrid = {150,225,210,138};
		int[] spaceThreeGrid = {250,225,310,138};
		int[] spaceFourGrid = {350,225,410,138};
		int[] spaceFiveGrid = {450,225,510,138};
		int[] spaceSixGrid = {550,225,610,138};
		int[] spaceSevenGrid = {650,225,710,138};
		//END GRID FOR PLAYERS CARDS
		
		//GRID FOR PLACED CARDS
		int[] stackOneGrid = {50,425,110,338};
		int[] stackTwoGrid = {150,425,210,338};
		int[] stackThreeGrid = {250,425,310,338};
		int[] stackFourGrid = {350,425,410,338};
		//END GRID FOR PLACED CARDS
		
		
		//GET MOUSE POSITION
		int p_x = Mouse.getX();
		int p_y = Mouse.getY();
		//END GET MOUSE POSITION
		
		
		//WHAT HAPPENS WHEN MOUSE IS CLICKED
		if(container.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			
		
			

			System.out.print(p_x);
			System.out.print(", ");
			System.out.print(p_y);
			System.out.print("    ");

		}		
		//END MOUSE CLICKED AREA
		
	}
	

	
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException {
			int p_x = Mouse.getX();
			int p_y = Mouse.getY();
			
			
			
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
			
	
			
			Image[] imgArr = new Image[52]; 

			
			//SET IMAGES TO DEALT SPACE IN ARRAY (BETTER TO USE HASHMAP?)
			for (int q=0; q<52; q++) {
				
				if (deck3[q] == "AH")
				{
				imgArr[q] = img_AH;
				}
				if (deck3[q] == "2H")
				{
				imgArr[q] = img_2H; 	
				}
				if (deck3[q] == "3H")
				{
				imgArr[q] = img_3H; 	
				}
				if (deck3[q] == "4H")
				{
				imgArr[q] = img_4H; 	
				}
				if (deck3[q] == "5H")
				{
				imgArr[q] = img_5H; 	
				}
				if (deck3[q] == "6H")
				{
				imgArr[q] = img_6H; 	
				}
				if (deck3[q] == "7H")
				{
				imgArr[q] = img_7H; 	
				}
				if (deck3[q] == "8H")
				{
				imgArr[q] = img_8H; 	
				}
				if (deck3[q] == "9H")
				{
				imgArr[q] = img_9H; 	
				}
				if (deck3[q] == "TH")
				{
				imgArr[q] = img_TH; 	
				}
				if (deck3[q] == "JH")
				{
				imgArr[q] = img_JH; 	
				}
				if (deck3[q] == "QH")
				{
				imgArr[q] = img_QH; 	
				}
				if (deck3[q] == "KH")
				{
				imgArr[q] = img_KH; 	
				}
				
				
				
				if (deck3[q] == "AC")
				{
				imgArr[q] = img_AC; 	
				}
				if (deck3[q] == "2C")
				{
				imgArr[q] = img_2C; 	
				}
				if (deck3[q] == "3C")
				{
				imgArr[q] = img_3C; 	
				}
				if (deck3[q] == "4C")
				{
				imgArr[q] = img_4C; 	
				}
				if (deck3[q] == "5C")
				{
				imgArr[q] = img_5C; 	
				}
				if (deck3[q] == "6C")
				{
				imgArr[q] = img_6C; 	
				}
				if (deck3[q] == "7C")
				{
				imgArr[q] = img_7C; 	
				}
				if (deck3[q] == "8C")
				{
				imgArr[q] = img_8C; 	
				}
				if (deck3[q] == "9C")
				{
				imgArr[q] = img_9C; 	
				}
				if (deck3[q] == "TC")
				{
				imgArr[q] = img_TC; 	
				}
				if (deck3[q] == "JC")
				{
				imgArr[q] = img_JC; 	
				}
				if (deck3[q] == "QC")
				{
				imgArr[q] = img_QC; 	
				}
				if (deck3[q] == "KC")
				{
				imgArr[q] = img_KC; 	
				}
				
				
				if (deck3[q] == "AD")
				{
				imgArr[q] = img_AD; 	
				}
				if (deck3[q] == "2D")
				{
				imgArr[q] = img_2D; 	
				}
				if (deck3[q] == "3D")
				{
				imgArr[q] = img_3D; 	
				}
				if (deck3[q] == "4D")
				{
				imgArr[q] = img_4D; 	
				}
				if (deck3[q] == "5D")
				{
				imgArr[q] = img_5D; 	
				}
				if (deck3[q] == "6D")
				{
				imgArr[q] = img_6D; 	
				}
				if (deck3[q] == "7D")
				{
				imgArr[q] = img_7D; 	
				}
				if (deck3[q] == "8D")
				{
				imgArr[q] = img_8D; 	
				}
				if (deck3[q] == "9D")
				{
				imgArr[q] = img_9D; 	
				}
				if (deck3[q] == "TD")
				{
				imgArr[q] = img_TD; 	
				}
				if (deck3[q] == "JD")
				{
				imgArr[q] = img_JD; 	
				}
				if (deck3[q] == "QD")
				{
				imgArr[q] = img_QD; 	
				}
				if (deck3[q] == "KD")
				{
				imgArr[q] = img_KD; 	
				}
				
				
				
				if (deck3[q] == "AS")
				{
				imgArr[q] = img_AS; 	
				}
				if (deck3[q] == "2S")
				{
				imgArr[q] = img_2S; 	
				}
				if (deck3[q] == "3S")
				{
				imgArr[q] = img_3S; 	
				}
				if (deck3[q] == "4S")
				{
				imgArr[q] = img_4S; 	
				}
				if (deck3[q] == "5S")
				{
				imgArr[q] = img_5S; 	
				}
				if (deck3[q] == "6S")
				{
				imgArr[q] = img_6S; 	
				}
				if (deck3[q] == "7S")
				{
				imgArr[q] = img_7S; 	
				}
				if (deck3[q] == "8S")
				{
				imgArr[q] = img_8S; 	
				}
				if (deck3[q] == "9S")
				{
				imgArr[q] = img_9S; 	
				}
				if (deck3[q] == "TS")
				{
				imgArr[q] = img_TS; 	
				}
				if (deck3[q] == "JS")
				{
				imgArr[q] = img_JS; 	
				}
				if (deck3[q] == "QS")
				{
				imgArr[q] = img_QS; 	
				}
				if (deck3[q] == "KS")
				{
				imgArr[q] = img_KS; 	
				}
			
			//END IMAGES TO DEALT SPACE
			}
	
			
			//SET CARDS TO DEALT POSITION
			spaceOne[0] = imgArr[0];
			
			spaceTwo[0] = imgArr[1];
			spaceTwo[1] = imgArr[7]; 
			
			spaceThree[0] = imgArr[2]; 
			spaceThree[1] = imgArr[8];
			spaceThree[2] = imgArr[13];
					
			spaceFour[0] = imgArr[3];
			spaceFour[1] = imgArr[9];
			spaceFour[2] = imgArr[14];
			spaceFour[3] = imgArr[18];
			
			spaceFive[0] = imgArr[4];
			spaceFive[1] = imgArr[10];
			spaceFive[2] = imgArr[15];
			spaceFive[3] = imgArr[19];
			spaceFive[4] = imgArr[22];
			
			spaceSix[0] = imgArr[5];
			spaceSix[1] = imgArr[11];
			spaceSix[2] = imgArr[16];
			spaceSix[3] = imgArr[20];
			spaceSix[4] = imgArr[23];
			spaceSix[5] = imgArr[25];
			
			spaceSeven[0] = imgArr[6];
			spaceSeven[1] = imgArr[12];
			spaceSeven[2] = imgArr[17];
			spaceSeven[3] = imgArr[21];
			spaceSeven[4] = imgArr[24];
			spaceSeven[5] = imgArr[26];
			spaceSeven[6] = imgArr[27];
			
			//END SET CARDS TO DEALT POSITION
	
		
			
			
			
		}









	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
